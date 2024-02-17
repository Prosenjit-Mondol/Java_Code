/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

abstract class mark{
    abstract int getpercentage();
}
class A extends mark{
    int subject_one;
    int subject_two;
    int subject_three;

    public A(int subject_one, int subject_two, int subject_three) {
        this.subject_one = subject_one;
        this.subject_two = subject_two;
        this.subject_three = subject_three;
    }
    @Override
    int getpercentage(){
        return (subject_one + subject_two + subject_three)*100/300;
    }
}
class B extends mark{
    int subject_one;
    int subject_two;
    int subject_three;
    int subject_four;

    public B(int subject_one, int subject_two, int subject_three, int subject_four) {
        this.subject_one = subject_one;
        this.subject_two = subject_two;
        this.subject_three = subject_three;
        this.subject_four = subject_four;
    }
    @Override
    int getpercentage(){
        return (subject_one + subject_two + subject_three+subject_four)*100/400;
    }
}
public class abthree {
    public static void main(String[] args) {
        A a=new A(89,95,93);
        System.out.println(a.getpercentage());
        B b=new B(89,92,93,96);
        System.out.println(b.getpercentage());
    }
}
