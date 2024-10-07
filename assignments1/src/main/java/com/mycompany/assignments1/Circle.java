/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;

/**
 *
 * @author kenku
 */
public class Circle extends Shape{
    
    
    public Circle(Point point, double length) {
        super(point,length);
    }
    
    @Override
    public boolean contains(Point other){
        double dx = other.getX() - point.getX();  
        double dy = other.getY() - point.getY();  

        return (dx * dx + dy * dy) <= (length * length);
    }
    
}
