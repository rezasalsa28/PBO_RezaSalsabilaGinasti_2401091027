/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan15042025;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Example {
    public  static  void main(String[] args){
        Shape circle = new Circle(5);
        Shape square = new Square(7);
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Pilih opsi");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        try {
            int n = Input.nextInt();
            if (n == 1) {
                System.out.println("Nama bentuk: " + circle.getName());
                System.out.println("Luas: " + circle.getArea());
            }
            else if (n == 2) {
                System.out.println("Nama bentuk: " + square.getName());
                System.out.println("Luas: " + square.getArea());
            }
            else {
                System.out.println("Error!");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
        
        Input.close();
    }

    
}
