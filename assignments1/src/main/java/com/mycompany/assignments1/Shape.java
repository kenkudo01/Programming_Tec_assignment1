/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;

/**
 *
 * @author kenku
 */
abstract class Shape {
    
    public double length;
    public Point point;
    
    public Shape(Point point, double length){
        this.point = point;
        this.length = length;
    }
        
    public abstract boolean contains(Point point);
    

}
