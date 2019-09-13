package assignments;

import java.util.Scanner;

public class PoundConverter {

    public static void main(String[] args) {

        double poundsEntered;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of pounds>>>> ");
        poundsEntered = input.nextDouble();

        calculateKilo(poundsEntered);
        calculateOunce(poundsEntered);
        calculateMilli(poundsEntered);
    }
    public static void calculateKilo(double poundsEntered) {

        final double KILO_FORMULA = 2.205;
        double total = poundsEntered / KILO_FORMULA;
        System.out.println("In " + poundsEntered + " pounds, there are " + total + " kilograms.");
    }
    public static void calculateOunce(double poundsEntered) {

        final double OUNCE_IN_POUND = 16;
        double total = poundsEntered * OUNCE_IN_POUND;
        System.out.println("In " + poundsEntered + " pounds, there are " + total + " ounces.");
    }
    public static void calculateMilli(double poundsEntered) {

        final double MILLIGRAM_IN_POUND = 453592.37;
        double total = poundsEntered * MILLIGRAM_IN_POUND;
        System.out.println("In " + poundsEntered + " pounds, there are " + total + " milligrams.");
    }
}

