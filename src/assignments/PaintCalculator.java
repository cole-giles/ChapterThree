package assignments;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {

        double h;
        double l;
        double w;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of your room>>>> ");
        l = input.nextDouble();
        System.out.print("Enter the width of your room>>>> ");
        w = input.nextDouble();
        System.out.print("Enter the height of your room>>>> ");
        h = input.nextDouble();

        calculateArea(l,w,h);

    }
    public static void calculateArea(double h, double w, double l) {

        double area;

        area = ((w*h)*2) + ((h*l)*2);
        calculateCost(area);
    }
    public static void calculateCost(double area) {

        final double GALLON_PRICE = 32;
        final double GALLON_COVERAGE = 350;
        double numGallons;
        int gallonsRounded;
        double gallonCost;

        numGallons = area / GALLON_COVERAGE;
        gallonsRounded = (int)Math.ceil(numGallons);
        gallonCost = gallonsRounded * GALLON_PRICE;

        System.out.println("Your walls have a collective area of " + area + ", and with a gallon covering 350 sq feet, it would take " + gallonsRounded + " gallon(s), which would cost $" + gallonCost + ".");
    }
}