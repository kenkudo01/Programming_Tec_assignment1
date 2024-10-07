/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;

/**
 *
 * @author kenku
 */
public class Square extends Shape {
    
    public Square(Point point, double length) {
        super(point,length);
    }
       
    @Override
    public boolean contains(Point other){
        
        double half_length = length / 2;
        //right-top
        var rt = point.getX() - half_length;
        //right-bottom
        var rb = point.getX() + half_length;
        //left-top
        var lt= point.getY() - half_length;
        //left-bottom
        var lb =point.getY() + half_length;
        
        return (rt <= other.getX() && rb >= other.getX()) &&
               (lt <= other.getY() && lb >= other.getY());
    }
    
}
