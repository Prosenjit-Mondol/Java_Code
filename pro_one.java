/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

abstract class parent{
    abstract void message();
}
class first extends parent{
    @Override
    void message(){
        System.out.println("This is First subclass");
    }
}
class second extends parent{
    @Override
    void message(){
        System.out.println("This is Second subclass");
    }
}
public class pro_one {
    public static void main(String[] args) {
        first f=new first();
        second s=new second();
        f.message();
        s.message();
    }
}
