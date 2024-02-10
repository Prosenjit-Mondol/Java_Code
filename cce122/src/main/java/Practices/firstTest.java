/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

/**
 *
 * @author HP
 */
public class firstTest extends first{
    String name;
    
    firstTest(String c, double w, String n){
        super(c,w);//calling constructor of the first class
        name=n;
    }
    @Override
    void dis(){
        System.out.println("Name :"+name);
        super.dis();
    }
    
    public static void main(String[] args) {
        firstTest ft=new firstTest("Blue",598,"Prosenjit");
        ft.dis();
        
    }
}
