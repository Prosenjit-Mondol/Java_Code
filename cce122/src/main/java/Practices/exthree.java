/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

class ExceptionAA extends Exception{
    public ExceptionAA(String message){
        super(message);
    }
}
class ExceptionBB extends ExceptionAA{

    public ExceptionBB(String message) {
        super(message);
    }
    
}
class ExceptionC extends ExceptionB{

    public ExceptionC(String message) {
        super(message);
    }
    
}
public class exthree {
    public static void main(String[] args) {
        try{
            throw new ExceptionBB("Exception of type ExceptionB");
        }catch(ExceptionAA e){
            System.out.println(e);
        }
        try{
            throw new ExceptionC("Exception of type ExceptionC");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
