/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17sep13;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author useruser
 */
public class WackyWeather {
    public static void main(String[] args) {
        //define variables and objects to be used in the program
        int temperature;
        Scanner keyboard=new Scanner(System.in);
            //Ask the user for the weather
        System.out.println("Please enter the tenpatue outside: ");    
        temperature=keyboard.nextInt();
        //if it is at or below 0, tell them to put n a coat
        if (temperature<=0) {
            System.out.println("Brrr...puton a coat");
        }
        else if (temperature>0 && temperature<20) {
            System.out.println("Nice, but put on a sweat");
        } 
        else{
            System.out.println("Great day!Wear what you want");
        }
        
            
        
    }
}
