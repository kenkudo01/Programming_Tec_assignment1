/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;

/**
 *
 * @author kenku
 */
public class Triangle extends Shape{
    
    
    // this length is a side length
    private double height;
    private Point top;
    private Point left;
    private Point right;
    private double centerToMidDist;
    
    private static final double EPSILON = 1e-7; 
    
    public Triangle(Point point, double length){
        super(point, length);
        this.height = length * (Math.sqrt(3) / 2); 
        this.centerToMidDist = height / 3;
        this.top = new Point(point.getX(), point.getY() + 2 * centerToMidDist);
        this.left = new Point(point.getX() - length / 2, point.getY() - centerToMidDist);
        this.right = new Point(point.getX() + length / 2, point.getY() - centerToMidDist);
    }
    
    public Triangle(Point a, Point b, Point c){
        super(null, 0);
        this.top = a;
        this.left = b;
        this.right = c;
    }
    
    
    public double getHeight(){return height;}
    public Point getTop(){return top;}
    public Point getLeft(){return left;}
    public Point getRight(){return right;}
    public double centerToMidDist(){return centerToMidDist;}
    
    //abs(x1(y2-y3)+x2(y3-y1)+x3(y1-y2)) / 2 = Area
    public double areaCal(Point xy1, Point xy2, Point xy3){
        double x1 = xy1.getX()*(xy2.getY()- xy3.getY());
        double x2 = xy2.getX() * (xy3.getY() - xy1.getY());
        double x3 = xy3.getX() * (xy1.getY() - xy2.getY());
        
        return Math.abs((x1+x2+x3) / 2.0);
    }
    
    @Override
    public boolean contains(Point other){
        double mainArea = areaCal(top, left, right);
        //with other Point
        double sub1 = areaCal(other, left, right);
        double sub2 = areaCal(top, other, right);
        double sub3 = areaCal(top, left, other);
        //total subArea
        double subArea = sub1 + sub2 + sub3;
        
        //making three Area with other point.
        //if the total three subArea is same as mainArea
        //it means the Point other contains in the triangle.
        //the margin of error is 1e-7;
        return Math.abs(mainArea - subArea) < EPSILON;
    }
    
}
