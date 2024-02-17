/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;


public class exseven {
    static void someMethod2() throws Exception{
        throw new Exception("An Exception");
    }
    static void someMethod() throws Exception{
        someMethod2();
    }
    public static void main(String[] args) {
        try{
            someMethod2();
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}
