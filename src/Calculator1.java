import java.util.Scanner;

public class Calculator1 {
    public static void sum(int num1, int num2)
    {
        int sum = num1 + num2;

        System.out.println("Sum of two nos: " + sum);}

    public static void subtract(int num1, int num2)
    {

        int subtract = num1 - num2;

        System.out.println("Subtraction of two nos: " + subtract);}

    public static void multiply(int num1, int num2)
    {

        int multiply = num1 * num2;

        System.out.println("Multiplication of two nos: " + multiply);}

    public static void division(int num1, int num2)
    {

        int division = num1 / num2;

        System.out.println("Division of two nos: " + division);}

    public static void modulus(int num1, int num2)
    {

        int modulus = num1 % num2;

        System.out.println("Modulus of two nos: " + modulus);}

    public static void main(String[] args) {

        System.out.println("CALCULATOR");
        System.out.println("********************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.println("********************");
        System.out.println("Please enter your choice");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Enter the value of first Integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the value of second Integer :");
        int num2 = scanner.nextInt();


        switch (input) {
            case 1:
                sum(num1, num2);
                break;

            case 2:
                subtract(num1, num2);
                break;

            case 3:
                multiply(num1, num2);
                break;

            case 4:
                division(num1, num2);
                break;

            case 5:
                modulus(num1, num2);
                break;

            case 6:
                System.out.println("********************");

        }

    }


}


