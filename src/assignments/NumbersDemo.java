package assignments;

import java.util.Scanner;

public class NumbersDemo {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number>>>> ");
        x = input.nextInt();
        System.out.print("Enter another number>>>> ");
        y = input.nextInt();

        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);

    }
    public static void displayTwiceTheNumber(int x, int y){

        int x2;
        int y2;

        x2 = x *2;
        y2 = y *2;
        System.out.println(x2 + "  " + y2);
    }
    public static void displayNumberPlusFive(int x, int y){

        int xPlusFive;
        int yPlusFive;

        xPlusFive = x + 5;
        yPlusFive = y + 5;
        System.out.println(xPlusFive + "  " + yPlusFive);
    }
    public static void displayNumberSquared(int x, int y){

        int xSquared;
        int ySquared;

        xSquared = (int)Math.pow(x,2);
        ySquared = (int)Math.pow(y,2);
        System.out.println(xSquared + "  " + ySquared);
    }
}
