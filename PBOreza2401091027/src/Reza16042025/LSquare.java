/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reza16042025;

/**
 *
 * @author ASUS
 */
public class LSquare implements Relation {
    private double p;
    private double l;

    public LSquare(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double getWide() {
        double wide = p * l;

        return wide;
    }

    public double getArround() {
        double arround = 2 * (p + l);

        return arround;
    }

    @Override
    public boolean isGreaterWide(Object a, Object b) {
        double aWide = ((LSquare)a).getWide();
        double bWide = ((LSquare)b).getWide();
        
        return (aWide>bWide);
    }

    @Override
    public boolean isLessWide(Object a, Object b) {
        double aWide = ((LSquare)a).getWide();
        double bWide = ((LSquare)b).getWide();
        
        return (aWide<bWide);
    }
    
    @Override
    public boolean isEqualWide(Object a, Object b) {
        double aWide = ((LSquare)a).getWide();
        double bWide = ((LSquare)b).getWide();
        
        return (aWide==bWide);
    }
    
    @Override
    public boolean isGreaterArround(Object x, Object y) {
        double xArround = ((LSquare)x).getArround();
        double yArround = ((LSquare)y).getArround();
        
        return (xArround>yArround);
    }

    @Override
    public boolean isLessArround(Object x, Object y) {
        double xArround = ((LSquare)x).getArround();
        double yArround = ((LSquare)y).getArround();
        
        return (xArround<yArround);
    }
    
    @Override
    public boolean isEqualArround(Object x, Object y) {
        double xArround = ((LSquare)x).getArround();
        double yArround = ((LSquare)y).getArround();
        
        return (xArround==yArround);
    }

}
