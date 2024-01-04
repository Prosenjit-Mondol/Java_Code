/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

class shap{
    void show(){
        System.out.println("This is shap class's show");
    }
    void getInfo(){
        System.out.println("This is shap clas's getInfo");
    }
}
class circle extends shap{
    @Override
    void show(){
        System.out.println("This is  circle class's show");
    }
}
class rectangle extends shap{
    @Override
    void show(){
        System.out.println("This is rectangle class's show");
    }
}
public class input_one {
    public static void main(String[] args) {
        shap s=new shap();
        s.show();
        s.getInfo();
        
        circle c=new circle();
        c.show();
        c.getInfo();
        
        rectangle r=new rectangle();
        r.show();
        r.getInfo();
    }
}
