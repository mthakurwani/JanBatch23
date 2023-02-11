import java.util.Scanner;

public class Tim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 for English");
        System.out.println("Please enter 2 for French");
        System.out.println("Please enter 3 for Spanish");
        int input = sc.nextInt();

        
        switch (input){
            case 1:
                System.out.println("English is selected");
                break;
            case 2:
                System.out.println("French is selected");
                break;
            case 3:
                System.out.println("Spanish is selected");
                break;
            default:
                System.out.println("Wrong input: please try again!");
         }


    }
}
