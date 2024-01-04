/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

abstract class marks{
    abstract int getPercentage();
}
class A extends marks{
    int s1;
    int s2;
    int s3;

    public A(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    int getPercentage(){
        return (s1+s2+s3)*100/300;
    }
}
class B extends marks{
    int s1;
    int s2;
    int s3;
    int s4;

    public B(int s1, int s2, int s3, int s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }
    @Override
    int getPercentage(){
        return (s1+s2+s3+s4)*100/400;
    }
}
public class pro_three {
    public static void main(String[] args) {
        A a=new A(100,80,85);
        System.out.println(a.getPercentage());
        
        B b=new B(98,95,93,92);
        System.out.println(b.getPercentage());
    }
}
