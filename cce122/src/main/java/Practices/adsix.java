/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;
import java.util.*;

abstract class Sh{
    abstract void rectanglearea(int l,int w);
    abstract void squarearea(int s);
    abstract void circlearea(int r);
    
}
class area extends Sh{
    @Override
    void rectanglearea(int l,int w){
        System.out.println("Area of rectangle :"+l*w);
    }
    @Override
    void squarearea(int s){
        System.out.println("Area of square:"+s*s);
    }
    @Override
    void circlearea(int r){
        System.out.println("Area of circle:"+3.14*r*r);
    }
}
public class adsix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        area[] a=new area[4];
        for (int i = 0; i <4; i++) {
            a[i]=new area();
            System.out.println("Enter rectengle side:");
            int x=in.nextInt();
            int y=in.nextInt();
            a[i].rectanglearea(x, y);
            System.out.println("Enter square side:");
            int s=in.nextInt();
            a[i].squarearea(s);
            System.out.println("Enter radious:");
            int r=in.nextInt();
            a[i].circlearea(r);
        }
//        a.rectanglearea(6,8);
//        a.squarearea(16);
//        a.circlearea(5);
    }
}
