/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

abstract  class parent{
    abstract void message();
}
class firsts extends parent{
    @Override
    void message(){
        System.out.println("This is first subclass");
    }
}
class second extends parent{
    @Override
    void message(){
        System.out.println("This is second subclass");
    }
}
public class abone {
    public static void main(String[] args) {
        firsts f=new firsts();
        f.message();
        second s=new second();
        s.message();
    }
}
