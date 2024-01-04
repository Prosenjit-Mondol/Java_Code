/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;
import java.util.*;
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
public class pro_seven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        area[] r=new area[4];
        System.out.println("Enter 4 input: ");
        for (int i = 0; i < 4; i++) {
            int x=in.nextInt();
            int y=in.nextInt();
            r[i].rectangle(x, y);
            r[i].square(x);
            r[i].circle(x);
        }
    }
}
