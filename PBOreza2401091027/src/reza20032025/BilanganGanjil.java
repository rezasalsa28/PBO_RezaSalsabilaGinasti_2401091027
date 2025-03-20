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

public class BilanganGanjil {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] bilanganGanjil = getBilanganGanjil(data);
        System.out.println(Arrays.toString(bilanganGanjil));
    }

    public static int[] getBilanganGanjil(int[] data) {
        int jumlahGanjil = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                jumlahGanjil++;
            }
        }

        int[] bilanganGanjil = new int[jumlahGanjil];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                bilanganGanjil[index] = data[i];
                index++;
        }
        }
        return bilanganGanjil;
    }
  }

