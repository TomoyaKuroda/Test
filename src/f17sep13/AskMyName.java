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
public class AskMyName {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner keyboard = new Scanner(System.in);
        
        String myName = keyboard.nextLine();
        
        System.out.printf("%nHello %s%n", myName);
    }
}
