/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza13032025;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class Latihan651Nilai2 {
    public static void main( String[] args ){
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        String  input1 = "";
        String  input2 = "";
        String  input3 = "";
        double average;
        
        input1 = JOptionPane.showInputDialog("Masukkan nilai 1: ");
        input2 = JOptionPane.showInputDialog("Masukkan nilai 2: ");
        input3 = JOptionPane.showInputDialog("Masukkan nilai 3: ");
        
        number1 = Integer.parseInt(input1);
        number2 = Integer.parseInt(input2);
        number3 = Integer.parseInt(input3);
        
        average= (number1 + number2+ number3)/3;
        if (average >= 60){
        String msg = "average is "+ average + " :-) ";
        JOptionPane.showMessageDialog(null, msg);}
        else{
        String msg = "average is "+ average + " :-( ";
        JOptionPane.showMessageDialog(null, msg);}
    } 
}


