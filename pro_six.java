/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

abstract class shap{
    abstract void rectangle(int length,int breadth);
    abstract void square(int side);
    abstract void circle(int radius);
}
class area extends shap{
    @Override
    void rectangle(int length,int breadth){
        System.out.println("Area of Rectangle: "+length*breadth);
    }
    @Override
    void square(int side){
        System.out.println("Area of Square: "+side*side);
    }
    @Override
    void circle(int radius){
        System.out.println("Area of ccircle: "+3.14*radius*radius);
    }
}
public class pro_six {
    public static void main(String[] args) {
        area a =new area();
        a.rectangle(10,20);
        a.square(10);
        a.circle(10);
    }
}
