/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

class shap{
    void show(){
        System.out.println("This is shap class");
    }
    void getinfo(){
        System.out.println("This is shap class's getinfo");
    }
}
class circle extends shap{
    @Override
    void show(){
        System.out.println("This is circle class's show");
    }
}
class rectangle extends shap{
    @Override
    void show(){
        System.out.println("This is rectangle class's show");
    }
}
public class Pone {
    public static void main(String[] args) {
        shap s=new shap();
        s.show();
        s.getinfo();
        circle c=new circle();
        c.show();
        c.getinfo();
        rectangle r=new rectangle();
        r.show();
        r.getinfo();
    }
}
