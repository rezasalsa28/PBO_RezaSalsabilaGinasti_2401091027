/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza11032025;
import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class Tugas651 {
    public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        
        //for buffered reader
        int nilaia=0;
        int nilaib=0;
        int nilaic=0;
        double rata1;
        
        //buffered reader
        try{
            System.out.print("Enter nilai a : ");
            nilaia = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter nilai b : ");
            nilaib = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter nilai c: ");
            nilaic = Integer.parseInt(dataIn.readLine());
        }
        catch(IOException error){
            System.out.println("Error in getting input");
        }
        rata1 = (nilaia + nilaib + nilaic) /3;
        if(rata1>=60)
        {
            System.out.println("your average  : " + rata1 + " " + ":-)");
        }else{
            System.out.println("your average  : " + rata1 + " " + ":-(");
        }
        
        //for joptionpane
        int nilai1=0;
        int nilai2=0;
        int nilai3=0;
        double rata2;
        
        //joptionpane
        nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter ur first score: "));
        nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter ur second score: "));
        nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter ur third score: "));
        rata2=(nilai1+nilai2+nilai3)/3;
        
        if(rata2>=60){
            String msg = "your average  : " + rata2 + " " + ":-)";
            JOptionPane.showMessageDialog(null, msg);
        }else{
            String msg = "your average  : " + rata2 + " " + ":-(";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
    
}
