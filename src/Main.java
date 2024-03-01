import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "", titleResult = "", ageResult = "";
        int age = 0, grade = 0;

        name = getName();
        age = getAge();
        ageResult = calculateAgeResult(age);
        titleResult = getTitleResult();
        grade = getGrade();

        System.out.println("\n\n----------------------------------------------\nHi " + name + "\nyour age is: " + age +
                " that means you are: " + ageResult + "\n" +
                "your department is: " + titleResult + "\n" +
                "your salary grade is: " + grade + "\n" +
                "Welcome to our company");
    }

    public static String getName() {
        String name = "";
        System.out.print("Insert the name ? ");
        name = input.next();
        while (name.length() < 5) {
            System.out.println("Try again !");
            System.out.print("Insert the name ? ");
            name = input.next();
        }
        return name;
    }

    public static int getAge() {
        int age = 0;
        boolean isValid = false;
        do {
            System.out.print("How old are you ?");
            age = input.nextInt();
            if (age > 0) {
                isValid = true;
            } else {
                System.out.println("Please Enter a valid age!");
            }
        } while (!isValid);
        return age;
    }

    public static String calculateAgeResult(int age) {
        if (age > 50) {
            return "old";
        } else if (age > 11) {
            return "young";
        } else {
            return "Kid";
        }
    }

    public static String getTitleResult() {
        String title = "";
        boolean isValid = false;
        do {
            System.out.println("[1]Accountant \n[2]Developer \n[3]Researcher \n[4]Other");
            System.out.print("What is your title? ");
            title = input.next();
            switch (title) {
                case "Accountant":
                    isValid = true;
                    return "Accounting";
                case "Developer":
                    isValid = true;
                    return "IT";
                case "Researcher":
                    isValid = true;
                    return "Research";
                case "Other":
                    isValid = true;
                    return "Operations";
                default:
                    System.out.println("Please choose one of the listed items.");
            }
        } while (!isValid);
        return title;
    }

    public static int getGrade() {
        int grade = 0;
        boolean isValid = false;
        do {
            System.out.print("How many years of experience do you have?");
            grade = input.nextInt();
            if (grade > 0) {
                isValid = true;
                if (grade > 5) {
                    return 4;
                } else if (grade > 3) {
                    return 3;
                } else if (grade > 1) {
                    return 2;
                } else {
                    return 1;
                }
            } else {
                System.out.println("Please Enter a positive number ");
            }
        } while (!isValid);
        return grade;
    }
}
