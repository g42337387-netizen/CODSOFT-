import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("          Currency Converter             ");
        System.out.println("========================================\n");

        System.out.print("Enter base currency (e.g. USD): ");
        String baseCurrency = input.next().toUpperCase();

        System.out.print("Enter target currency (e.g. INR): ");
        String targetCurrency = input.next().toUpperCase();

        System.out.print("Enter amount to convert: ");

        while (!input.hasNextDouble()) {
            System.out.println("Please enter a valid number!");
            input.next();
            System.out.print("Enter amount to convert: ");
        }

        double amount = input.nextDouble();

        System.out.println("\nFetching latest exchange rates... please wait\n");

        double rate = getExchangeRate(baseCurrency, targetCurrency);

        if (rate == -1) {
            System.out.println("Sorry! Could not fetch exchange rate.");
            System.out.println("Please check your currency codes or internet connection.");
        } else {
            double convertedAmount = amount * rate;

            System.out.println("========================================");
            System.out.println("              RESULT                    ");
            System.out.println("========================================");
            System.out.println(amount + " " + baseCurrency + " = "
                    + String.format("%.2f", convertedAmount) + " " + targetCurrency);
            System.out.println("Exchange Rate Used: 1 " + baseCurrency + " = "
                    + rate + " " + targetCurrency);
            System.out.println("========================================");
        }

        input.close();
    }

    // fetches exchange rate using free API (exchangerate-api.com)
    static double getExchangeRate(String base, String target) {

        try {
            String urlString = "https://api.exchangerate-api.com/v4/latest/" + base;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                System.out.println("Error: Invalid currency code or no internet connection.");
                return -1;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String jsonResponse = response.toString();

            // simple string search to find the target currency rate
            // looking for "TARGET":number pattern in the JSON
            String searchKey = "\"" + target + "\":";
            int index = jsonResponse.indexOf(searchKey);

            if (index == -1) {
                System.out.println("Target currency code not found!");
                return -1;
            }

            int startIndex = index + searchKey.length();
            int endIndex = startIndex;

            // read till comma or closing brace
            while (endIndex < jsonResponse.length()
                    && jsonResponse.charAt(endIndex) != ','
                    && jsonResponse.charAt(endIndex) != '}') {
                endIndex++;
            }

            String rateString = jsonResponse.substring(startIndex, endIndex).trim();
            return Double.parseDouble(rateString);

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            return -1;
        }
    }
}
