/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignments1;

import java.io.FileNotFoundException;

/**
 *
 * @author kenku
 */
public class Assignments1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String txtName = "empty.txt";
        String filename = "C:/Users/kenku/Desktop/university/3_semester/Programming_Technology/assignments1/"+txtName;
        
        Database database = new Database();
        try {
            
            database.read(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.exit(-1);
        } catch (InvalidInputException ex) {
            System.out.println("Invalid input!");
            System.exit(-1);
        }
        
        Point one = database.pre();
        database.run(one);
    }
    //Sample Point
    //test1 : 1.0 1.0 => success
    
    
    
}
