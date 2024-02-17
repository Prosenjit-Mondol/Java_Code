/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

/**
 *
 * @author HP
 */
public class exeight {
    static void another_method(){
        try{
            System.out.println(1/0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e+"-Array Index");
        }
    }
    public static void main(String[] args) {
        try{
            try{
                another_method();
            }catch(ArithmeticException e){
                System.out.println(e+"-Arithmetic");
            }
        }catch(Exception e){
            System.out.println(e+"-General");
        }
    }
}
