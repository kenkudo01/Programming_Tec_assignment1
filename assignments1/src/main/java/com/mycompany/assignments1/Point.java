/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;
import java.util.ArrayList;

/**
 *
 * @author kenku
 */
public class Point {
    
    private double x,y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        
    }

    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
    
    @Override
    public String toString(){
        return "( " + x + ", " + y +" )";
    
    }
    
            
    
}
