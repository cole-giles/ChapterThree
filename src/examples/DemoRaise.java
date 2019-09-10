package examples;

import java.util.Scanner;

public class DemoRaise {

    public static void main(String[] args) {

        double salary;
        pl("Demonstrating some raises:");

        Scanner input = new Scanner(System.in);
        pl("Enter your current Salary>>>> ");
        salary = input.nextDouble();

        predictRaise(salary);


    }
    public static void predictRaise(double salary) {

        double newSalary;
        final double RAISE_RATE = 1.10;

        newSalary = RAISE_RATE *salary;

        pl("Current Salary: " + salary + "\n After raise: " + newSalary);
    }
    public static void pl(String p) {
        System.out.println(p);
    }
}
