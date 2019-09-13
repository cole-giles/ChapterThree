package examples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int entryOne;
        int entryTwo;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number>>>> ");
        entryOne = input.nextInt();
        System.out.print("Enter another number>>>> ");
        entryTwo = input.nextInt();

        calculateAdd(entryOne,entryTwo);
        calculateSub(entryOne,entryTwo);
        calculateMulti(entryOne,entryTwo);
        calculateDiv(entryOne,entryTwo);

    }
    public static void calculateAdd(int entryOne,int entryTwo) {
        int total = entryOne + entryTwo;
        System.out.println(entryOne + " + " + entryTwo + " = " + total);
    }
    public static void calculateSub(int entryOne,int entryTwo) {
        int total = entryOne - entryTwo;
        System.out.println(entryOne + " - " + entryTwo + " = " + total);
    }
    public static void calculateMulti(int entryOne,int entryTwo) {
        int total = entryOne * entryTwo;
        System.out.println(entryOne + " * " + entryTwo + " = " + total);
    }
    public static void calculateDiv(int entryOne,int entryTwo) {
        int total = entryOne / entryTwo;
        int remainder = entryOne % entryTwo;
        System.out.println(entryOne + " / " + entryTwo + " = " + total + " Remainder: " + remainder);
    }
}
