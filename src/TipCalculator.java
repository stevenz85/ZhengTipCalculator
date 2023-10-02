import java.util.*;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        //The following is a creation of a list used to store the item's names

        List<String> list=new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        //The following is used to initialize all the variables so that they can be edited in the future

        double cost = 1.0;
        double totalBill = 0.0;
        double tip;
        double total;
        double perPerson;
        double perPersonTip;
        double perTotal;
        double realTotal;

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int numberPeople = scan.nextInt();

        System.out.print("What's the tip percentage? (Please type a number from 0-100): ");
        double tipPer = scan.nextInt();

        double tipPer2 = tipPer / 100;

        System.out.print("What's the discount? (Please type a number from 0-100): ");
        double discount = scan.nextInt();

        discount = discount / 100;

        System.out.println("Type -1 to finish calculations.");

        //The following code goes on a loop to obtain all the item's name as well as their price

        while (cost > 0.0){
            System.out.print("Enter a cost in dollars and cents: ");
            cost = scan.nextDouble();
            if (cost > 0.0) {
                totalBill = totalBill + cost;
                System.out.print("Enter the item's name: ");
                String item = scan.next();
                list.add(item);
            }
        }

        //The following code calculates all the numbers

        tip = ((int) (totalBill * tipPer2) * 100) / 100;
        total = totalBill + tip;
        perPerson = totalBill/numberPeople;
        perPerson = ((int) (perPerson * 100)) / 100;
        perPersonTip = tip/ (double) numberPeople;
        perPersonTip = ((int) (perPersonTip * 100)) / 100;
        perTotal = total/numberPeople;
        perTotal = ((int) (perTotal * 100)) / 100;
        realTotal = total - (total * discount);
        realTotal = ((int) (realTotal * 100)) / 100;
        discount = discount / 100;

        // The following code prints out the recipe

        System.out.println("---------------------------------");
        System.out.println("Total bill before tip: $" + totalBill);
        System.out.println("Total tip percentage: " + tipPer + "%");
        System.out.println("Total discount percentage: " + discount + "%");
        System.out.println("Total tip: $" + tip);
        System.out.println("total bill with tip: $" + total);
        System.out.println("Per person cost before tip: $" + perPerson);
        System.out.println("Tip per person: $" + perPersonTip);
        System.out.println("Total cost per person: $" + perTotal);
        System.out.println("Total cost after discount: $" + realTotal);
        System.out.println("---------------------------------");
        System.out.println("Items ordered:");
        for(String items:list)
            System.out.println(items);
        scan.close();
    }
}

