package assignments;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for conversion>>>> ");
        num = input.nextInt();

        inchConverter(num);
        gallonConverter(num);
    }
    public static void inchConverter(int num) {

        final double CENT_IN_INCH = 2.54;
        double numConverted;

        numConverted = num * CENT_IN_INCH;
        System.out.println("In " + num + " inches, there are " + numConverted + " centimeters.");
    }
    public static void gallonConverter(int num) {

        double numConverted;
        final double LIT_IN_GAL = 3.7854;

        numConverted = num * LIT_IN_GAL;
        System.out.println("In " + num + " gallons, there are " + numConverted + " liters.");
    }

}
