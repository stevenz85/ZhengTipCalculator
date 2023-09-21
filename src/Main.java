import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalTip = 0.00;

        System.out.println("Welcome to Tip Calculator!");
        System.out.println("I help my users calculate their tips!");
        System.out.println("What's the tip percentage? (Please enter a number from 0 to 100): ");
        double tip = scan.nextDouble();
        System.out.println("How many people are eating with you?");
        double totalBill = 0.00;
        double bill = 0.00;
        double price = 0.00;

        System.out.println("Enter -1 to end calculation.");

        while (price != -1) {
            if (price != -1) {
                System.out.println("What is the item's name?");
                String item = scan.nextLine();
                System.out.println("What is " + item + "'s price?");
                double itemPrice = scan.nextDouble();

                totalTip = totalTip + (itemPrice * tip);
            }
        }

        System.out.print("Done!");

    }
}
