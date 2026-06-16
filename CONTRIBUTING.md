# Contributing Guidelines

Thank you for considering contributing to the CODSOFT Java Projects repository! This document provides guidelines and instructions for contributing.

## 📋 Table of Contents
- [Code of Conduct](#code-of-conduct)
- [How to Contribute](#how-to-contribute)
- [Development Setup](#development-setup)
- [Coding Standards](#coding-standards)
- [Commit Guidelines](#commit-guidelines)
- [Pull Request Process](#pull-request-process)

---

## Code of Conduct

### Our Commitment
We are committed to providing a welcoming and inclusive environment for all contributors. We expect all participants to:
- Be respectful of different viewpoints and experiences
- Provide constructive feedback
- Focus on the code, not the person
- Be patient with new contributors

### Unacceptable Behavior
- Harassment or discrimination of any kind
- Offensive comments related to personal characteristics
- Trolling or insults
- Any form of bullying

---

## How to Contribute

### Types of Contributions
We welcome contributions in various forms:

1. **Bug Reports** - Report issues you've found
2. **Feature Requests** - Suggest improvements or new features
3. **Code Improvements** - Optimize existing code
4. **Documentation** - Improve README or add comments
5. **Testing** - Add test cases and validation

### Before You Start
- Check existing issues to avoid duplicates
- Read through the documentation
- Understand the current codebase structure
- Ensure you have Java 8+ installed

---

## Development Setup

### Prerequisites
```
- Java Development Kit (JDK) 8 or higher
- Git
- Text editor or IDE (VS Code, IntelliJ IDEA, Eclipse)
```

### Setup Steps
```bash
# 1. Fork the repository
# 2. Clone your fork
git clone https://github.com/YOUR-USERNAME/CODSOFT-.git

# 3. Navigate to project directory
cd CODSOFT-

# 4. Create a feature branch
git checkout -b feature/your-feature-name

# 5. Make your changes
# 6. Test your changes
javac ProjectName/ProjectName.java
java ProjectName/ProjectName

# 7. Commit and push
git add .
git commit -m "descriptive message"
git push origin feature/your-feature-name
```

---

## Coding Standards

### Java Naming Conventions
```java
// Classes - PascalCase
public class GradeCalculator { }

// Methods - camelCase
public void calculateGrade() { }

// Variables - camelCase
int totalMarks;
double averagePercentage;

// Constants - UPPER_SNAKE_CASE
public static final double PASSING_PERCENTAGE = 40.0;
```

### Code Style
```java
// Use 4 spaces for indentation (not tabs)
if (condition) {
    // Code here
}

// Add meaningful comments
// Calculate total marks from array
int total = 0;
for (int mark : marks) {
    total += mark;
}

// Use descriptive variable names
int studentTotalMarks; // Good
int stm;               // Avoid
```

### Best Practices
- Keep methods focused and small (single responsibility)
- Add comments for complex logic
- Use meaningful variable names
- Validate user input
- Handle exceptions appropriately

---

## Commit Guidelines

### Commit Message Format
```
<type>: <subject>

<body>

<footer>
```

### Types
- `feat`: A new feature
- `fix`: A bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting)
- `refactor`: Code refactoring
- `test`: Adding tests
- `chore`: Build process, dependencies

### Examples
```bash
# Good
git commit -m "feat: Add input validation for grade calculator"
git commit -m "fix: Correct PIN validation in ATM machine"
git commit -m "docs: Update README with installation instructions"

# Avoid
git commit -m "Fixed stuff"
git commit -m "Updated code"
```

---

## Pull Request Process

### Before Submitting PR
1. ✅ Test your code thoroughly
2. ✅ Follow coding standards
3. ✅ Update documentation if needed
4. ✅ Add comments for complex logic
5. ✅ Ensure no merge conflicts

### PR Template
```markdown
## Description
Brief description of changes

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Documentation update
- [ ] Code improvement

## How to Test
Steps to verify the changes

## Checklist
- [ ] Code follows style guidelines
- [ ] Self-review completed
- [ ] Comments added for complex logic
- [ ] Documentation updated
- [ ] No new warnings generated
```

### PR Review Process
1. **Submission** - Your PR will be reviewed within 2-3 days
2. **Feedback** - Reviewers may request changes
3. **Revision** - Update your PR based on feedback
4. **Approval** - Once approved, it will be merged
5. **Merge** - Your contribution is now part of the project

---

## Issue Reporting

### Bug Report Template
```markdown
## Describe the Bug
Clear description of what the bug is

## Steps to Reproduce
1. Compile the project
2. Run the program
3. Enter specific input
4. Observe unexpected behavior

## Expected Behavior
What should happen instead

## Environment
- OS: [e.g., Windows 10]
- Java Version: [e.g., Java 11.0.1]
- Project: [e.g., GradeCalculator]
```

### Feature Request Template
```markdown
## Feature Description
Clear description of the requested feature

## Use Case
Why this feature would be useful

## Possible Solution
Suggestions for implementation (optional)

## Additional Context
Any other relevant information
```

---

## Code Review Checklist

When reviewing code, check for:
- ✅ Code follows Java conventions
- ✅ Variable names are descriptive
- ✅ Logic is clear and efficient
- ✅ Input validation is present
- ✅ Error handling is appropriate
- ✅ Comments explain complex sections
- ✅ No code duplication
- ✅ Methods are reasonably sized

---

## Questions or Need Help?

- **GitHub Issues** - Ask questions as issues
- **Discussions** - Use GitHub Discussions
- **Email** - Contact through GitHub profile

---

## Licensing

By contributing to this project, you agree that your contributions will be licensed under its MIT License.

---

**Thank you for contributing! Your efforts help make this project better for everyone.** 🙌

---

**Last Updated:** June 16, 2026
