/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments1;

/**
 *
 * @author kenku
 */
class InvalidInputException extends Exception {

    public InvalidInputException() {
       super();
    }
    
    public InvalidInputException(String message){
        super(message);
    }
    
}
