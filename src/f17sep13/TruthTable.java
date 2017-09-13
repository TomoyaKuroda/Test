/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17sep13;

/**
 *
 * @author useruser
 */
public class TruthTable {
    public static void main(String[] args) {
        System.out.printf("False and False = %s%n", false&&false);
        System.out.printf("False or False = %s%n", false||false);
        System.out.printf("Not False = %s%n", !false);
        System.out.printf("%nFalse and True = %s%n", false&&true);
        System.out.printf("False or True = %s%n", false||true);
        System.out.printf("Not True = %s%n", !true);    
        System.out.printf("%nTrue and False = %s%n", true&&false);
        System.out.printf("True or False = %s%n", true||false);
        System.out.printf("%nTrue and True = %s%n", true && true);    
        System.out.printf("True or True  = %s%n", true||true);    
    
    }
}
