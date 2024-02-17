/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

abstract class animal{
    abstract void cats();
    abstract void dogs();
    
}
class cat extends animal{
    @Override
    void cats(){
        System.out.println("Cats meow");
    }
    @Override
    void dogs(){
        
    }
}
class dog extends animal{
    @Override
    void cats(){
        
    }
    @Override
    void dogs(){
        System.out.println("Dogs bark");
    }
}
public class abfive {
    public static void main(String[] args) {
        cat c=new cat();
        c.cats();
        dog d=new dog();
        d.dogs();
    }
}
