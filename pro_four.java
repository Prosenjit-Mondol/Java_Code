/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

abstract class abs{

    public abs() {
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_met();
    void b_met(){
        System.out.println("This is a normal method of abstract class");
    }
}
class subclass extends abs{
    @Override
    void a_met(){
        System.out.println("This is abstract method");
    }
}
public class pro_four {
    public static void main(String[] args) {
        subclass s=new subclass();
        s.a_met();
        s.b_met();
        
    }
}
