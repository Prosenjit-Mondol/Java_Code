/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

abstract class ab{

    public ab() {
        System.out.println("This is constructor of ab class");
    }
   
    void b_met(){
        System.out.println("This is a normal method of ab class");
    }
     abstract void a_met();
}
class subclass extends ab{
    @Override
    void a_met(){
        System.out.println("This is abstract method");
    }
}
public class abfour {
    public static void main(String[] args) {
        subclass s=new subclass();
        s.a_met();
        s.b_met();
    }
}
