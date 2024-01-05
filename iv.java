/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_Ha;

import java.io.IOException;

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}
class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

public class iv {
    public static void main(String[] args) {
        try{
            throw new ExceptionA("Exception type A");
        } catch(Exception exception){
            System.out.println(exception);
        }
        try{
            throw new ExceptionB("Exception type B");
        } catch(Exception exception){
            System.out.println(exception);
        }
        try{
            throw new NullPointerException("Null pointer exception");
        } catch(Exception exception){
            System.out.println(exception);
        }
        try{
            throw new IOException("IO Exception");
        } catch(Exception exception){
            System.out.println(exception);
        }
    }
}
