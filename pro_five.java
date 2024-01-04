/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

abstract class animal{
    abstract void cats();
    abstract void dogs();
}
class c extends animal{
    @Override
    void cats(){
        System.out.println("Cats meow");
    }
    @Override
    void dogs(){
        
    }
}
class d extends animal{
    @Override
    void cats(){
    }
    @Override
    void dogs(){
        System.out.println("Dog's bark"); 
    }
}
public class pro_five {
    public static void main(String[] args) {
        c cc=new c();
        cc.cats();
        d dd=new d();
        dd.dogs();
    }
}
