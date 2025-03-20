/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza20032025;

/**
 *
 * @author ASUS
 */
public class ArithmeticOperation {
     public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <bilangan1> <bilangan2>");
            return;
        }

        try {
            int bilangan1 = Integer.parseInt(args[0]);
            int bilangan2 = Integer.parseInt(args[1]);

            int sum = bilangan1 + bilangan2;
            int difference = bilangan1 - bilangan2;
            int product = bilangan1 * bilangan2;
            double quotient = (double) bilangan1 / bilangan2;

            System.out.println("sum = " + sum);
            System.out.println("difference = " + difference);
            System.out.println("product = " + product);
            System.out.println("quotient = " + quotient);
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa bilangan integer");
        }
    }
}


