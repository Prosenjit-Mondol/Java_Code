/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.io.IOException;

class ExceptionA extends Exception{

    public ExceptionA(String message) {
        super(message);
    }
    
}
class ExceptionB extends ExceptionA{
    
    public ExceptionB(String message) {
        super(message);
    }
    
}

public class exfour {
    public static void main(String[] args) {
        try{
            throw new ExceptionA("Exception type A");
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            throw new ExceptionB("Exception type B");
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            throw new NullPointerException("Null pointer Exception");
            
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            throw new IOException("IOException");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
