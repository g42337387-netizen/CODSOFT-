import java.util.Scanner;

public class GradeCalculator {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=====");
        System.out.println("Student Grade Calculator     ");
        System.out.println("=====\n");

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("How many subjects? ");
        int numSubjects = input.nextInt();

        int[] marks = new int[numSubjects];
        int total = 0;

        System.out.println("\nEnter marks for each subject (out of 100):\n");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                input.next();
                System.out.print("Subject " + (i + 1) + " marks: ");
            }
         marks[i] = input.nextInt();

               if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Marks should be between 0 and 100. Enter again!");
                i--;
                continue;
            }

            total += marks[i];
        }

        double average = (double) total / numSubjects;
        String grade = getGrade(average);

        System.out.println("\n=========");
        System.out.println("           RESULT CARD                  ");
        System.out.println("===========");
        System.out.println("Student Name  : " + name);
        System.out.println("Total Marks   : " + total + " / " + (numSubjects * 100));
        System.out.println("Average       : " + String.format("%.2f", average) + "%");
        System.out.println("Grade         : " + grade);
        System.out.println("===========");

        if (average >= 75) {
            System.out.println("Great job " + name + "! Keep it up!");
        } else if (average >= 50) {
            System.out.println("Good effort " + name + "! You can do better!");
        } else {
            System.out.println("Don't give up " + name + "! Work harder next time!");
        }

        input.close();
    }

    static String getGrade(double avg) {
        if (avg >= 90) {
            return "A+ (Outstanding)";
        } else if (avg >= 80) {
            return "A  (Excellent)";
        } else if (avg >= 70) {
            return "B  (Very Good)";
        } else if (avg >= 60) {
            return "C  (Good)";
        } else if (avg >= 50) {
            return "D  (Average)";
        } else {
            return "F  (Fail)";
        }
    }
}
