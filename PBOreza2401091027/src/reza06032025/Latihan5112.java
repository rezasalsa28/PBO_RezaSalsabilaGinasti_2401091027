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
public class Latihan5112 {
    public static void main( String[] args ){
        String word1 = "";
        String word2 = "";
        String word3 = "";
        word1 = JOptionPane.showInputDialog("Enter word 1");
        word2 = JOptionPane.showInputDialog("Enter word 2");
        word3 = JOptionPane.showInputDialog("Enter word 3");
        
        String msg =  word1 + " " + word2 + " " + word3 + " ";
        JOptionPane.showMessageDialog(null, msg);
    }
}
