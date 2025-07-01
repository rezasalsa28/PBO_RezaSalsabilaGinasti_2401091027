/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza14052025;

/**
 *
 * @author ASUS
 */
public class ShapeExample {
    public static void main (String[] args){
       Square s = new Square(20);
       String nama = s.getName();
       double luas = s.getArea();
       System.out.println(nama);
       System.out.println(luas);
       s.setSisi(10);
       System.out.println(s.getArea());
            
       
               
               
  }
}
