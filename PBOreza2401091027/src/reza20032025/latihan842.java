/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza20032025;

/**
 *
 * @author ASUS
 */
public class latihan842 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <bilangan1> <bilangan2>");
            System.exit(1);
        }

        try {
            double bilangan1 = Double.parseDouble(args[0]);
            double bilangan2 = Double.parseDouble(args[1]);

            double sum = bilangan1 + bilangan2;
            double difference = bilangan1 - bilangan2;
            double product = bilangan1 * bilangan2;
            double quotient = bilangan1 / bilangan2;

            System.out.println("sum = " + sum);
            System.out.println("difference = " + difference);
            System.out.println("product = " + product);
            System.out.println("quotient = " + quotient);
        } catch (NumberFormatException e) {
            System.out.println("Error: Bilangan harus berupa angka");
            System.exit(1);
        }

    }
}
