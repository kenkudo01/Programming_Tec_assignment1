/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;

import java.io.*;
import java.util.*;


/**
 *
 * @author kenku
 */
public class Database {
    private ArrayList<Shape> shapes;
    
    public Database() {
        shapes = new ArrayList<>();
    }
    public Point pre(){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the x-coordinate: ");
            double x = Double.parseDouble(scanner.nextLine());

            // y座標の入力
            System.out.print("Enter the y-coordinate: ");
            double y = Double.parseDouble(scanner.nextLine());

            // Pointオブジェクトを作成
            return new Point(x, y);
    }
    public void read(String filename) throws FileNotFoundException, InvalidInputException{
        Scanner scan = new Scanner(new BufferedReader(new FileReader(filename)));
        
        int num = scan.nextInt();
        while(scan.hasNext()){
            Shape shape;
            String type = scan.next();
            double x, y, length;
            try {
            
            x = scan.nextDouble();
            y = scan.nextDouble();
            length = scan.nextDouble();
            } catch (InputMismatchException e) {
                throw new InvalidInputException("Invalid numeric input found.");
            }
            switch(type){
                case "c":
                    shape = new Circle(new Point(x,y), length);
                    break;
                case "t":
                    shape = new Triangle(new Point(x,y), length);
                    break;
                case "s":
                    shape = new Square(new Point(x,y), length);
                    break;
                case "h":
                    shape = new Hexagon(new Point(x,y), length);
                    break;
                default:
                    throw new InvalidInputException();
            
            }
            
            shapes.add(shape);
        
        }
        
        
    }
    
    public void run(Point other){
       
        int counter = 0;
        for(Shape shape : shapes){
            if(shape.contains(other)){
                counter++;
            }
        }
        if(counter==0)
            System.out.println("GIven point doesnot have any shape");
        else
            System.out.println("GIven point contains " +counter + " shapes");
    
    }
   
}

