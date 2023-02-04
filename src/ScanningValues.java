import java.util.Scanner;
//System.out.println("Please enter value for b");
//        int b = sc.nextInt();
public class ScanningValues {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value for a");
        int a = sc.nextInt();
        if (a >= 50) {
            System.out.println("a is greater than or equal to 50");
        } else if ((a >= 40) && (a <= 49)) {
            System.out.println("a is between 40 and 49");
        } else if ((a >= 30) && (a <= 39)) {
            System.out.println("a is between 30 and 39");
        } else if ((a >= 20) && (a <= 29)) {
            System.out.println("a is between 20 and 29");
        }

    }
}

