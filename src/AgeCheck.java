import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int userAge = 0;

        //data collection
        System.out.println("What is your age?");
        if (scan.hasNextInt()) {
            userAge = scan.nextInt();
        }
        else {
            System.out.println("Incorrect value type");
            System.exit(0);
        }

        //processing
        if (userAge < 21) {
            System.out.println("You do not get a wristband, please exit the kiosk");
        }

        else {
            System.out.println("Please wait for your wristband to be printed please");
        }


    }
}