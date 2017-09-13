/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17sep13;

import java.util.Scanner;

/**
 *
 * @author useruser
 */
public class Average {
    public static void main(String[] args) {
               
        
        /*
        *Ask the user to enter 3 numbers
        *The program will calculate the average of the 3 numbers
        *
        
        */
        
            //this defines 4 variables that can hold decimal number
            double num1, num2, num3, avg;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the first number: ");
            num1=keyboard.nextDouble();
            System.out.println("Please enter the second number: ");
            num2=keyboard.nextDouble();
            System.out.println("Please enter the third number: ");
            num3=keyboard.nextDouble();

            avg=(num1+num2+num3)/3;
            
            System.out.printf("The average of the number is %.1f%n", avg);
        
    }
}
