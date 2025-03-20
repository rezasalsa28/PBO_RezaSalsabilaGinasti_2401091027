/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza20032025;

/**
 *
 * @author ASUS
 */

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        int[] fibonacci = getFibonacci(data);
        System.out.println(Arrays.toString(fibonacci));
    }

    public static int[] getFibonacci(int[] data) {
        int jumlahFibonacci = 0;
        for (int i = 0; i < data.length; i++) {
            if (isFibonacci(data[i])) {
                jumlahFibonacci++;
            }
        }

        int[] fibonacci = new int[jumlahFibonacci];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (isFibonacci(data[i])) {
                fibonacci[index] = data[i];
                index++;
                      index++;
            }
        }
        return fibonacci;
    }

    public static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n == a || n == b) {
            return true;
        }
        int c = a + b;
        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}




    

