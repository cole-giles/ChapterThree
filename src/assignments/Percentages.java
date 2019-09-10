package assignments;

import java.util.Scanner;

public class Percentages {

    public static void main(String[] args) {

        double num1;
        double num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number>>>> ");
        num1 = input.nextDouble();
        System.out.print("Enter another number>>>> ");
        num2 = input.nextDouble();

        computePercent(num1, num2);
    }
    public static void computePercent(double num1, double num2){

        double percentOne;
        double finalPercent;
        double percentTwo;
        double finalPercentTwo;

        percentOne = num1 / num2;
        finalPercent = percentOne *100;

        percentTwo = num2 / num1;
        finalPercentTwo = percentTwo * 100;

        System.out.println(num1 + " is " + finalPercent + "% of " + num2);
        System.out.println(num2 + " is " + finalPercentTwo + "% of " + num1);
    }
}

