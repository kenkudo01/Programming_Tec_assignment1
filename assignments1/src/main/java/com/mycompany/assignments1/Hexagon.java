/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;

/**
 *
 * @author kenku
 */
public class Hexagon extends Shape{
    
    
    private double height;
    public double getHeight(){return this.height;}
    private Point[] vertices;
    
    public Hexagon(Point point, double length) {
        super(point,length);
        this.height = Math.sqrt(3) * length;
        
        this.vertices = new Point[6];
        vertices[0] = new Point(point.getX() - length, point.getY());
        vertices[1] = new Point(point.getX() - length/2, point.getY() + height/2);
        vertices[2] = new Point(point.getX() + length/2, point.getY() + height/2);
        vertices[3] = new Point(point.getX() + length, point.getY());
        vertices[4] = new Point(point.getX() + length/2, point.getY() - height/2);
        vertices[5] = new Point(point.getX() - length/2, point.getY() - height/2);  
        
    }
    
    // we can think Hexagon contains 6 triangle
    //i have to define 6 Point.

    
    @Override
    public boolean contains(Point other){
        Triangle[] triangles = new Triangle[6];
        
        triangles[0] = new Triangle(vertices[0], vertices[1], point);
        triangles[1] = new Triangle(vertices[0], vertices[1], point);
        triangles[2] = new Triangle(vertices[0], vertices[1], point);
        triangles[3] = new Triangle(vertices[0], vertices[1], point);
        triangles[4] = new Triangle(vertices[0], vertices[1], point);
        triangles[5] = new Triangle(vertices[0], vertices[1], point);
        
        for(Triangle triangle : triangles){
            if(triangle.contains(other))
                return true;
        }
        return false;
    }
}
