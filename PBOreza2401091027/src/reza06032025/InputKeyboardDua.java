/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza06032025;

/**
 *
 * @author LAB-MM
 */
import javax.swing.JOptionPane;
public class InputKeyboardDua {
    public static void main( String[] args ){
        String nama = "";
        nama = JOptionPane.showInputDialog("Please Enter Your Name");
        
        String msg = "Hello " + nama + "";
        JOptionPane.showMessageDialog(null, msg);
    } 
}
