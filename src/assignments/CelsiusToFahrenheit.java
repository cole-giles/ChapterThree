package assignments;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

       double temp;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a temperature>>>> ");
       temp = input.nextDouble();

       tempConversion(temp, "8:00");
        tempConversion(temp, "12:00");
        tempConversion(temp, "5:00");


    }
    public static void tempConversion(double temp, String time) {

        double celsiusConversion = (temp - 32)*(5/9);
        System.out.println("The temperature at " + time + " is " + celsiusConversion );



    }
}

