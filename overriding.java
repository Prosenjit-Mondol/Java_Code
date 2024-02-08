/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anisul;
class person{
    String name;
    int age;
    void dis(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
}
class teacher extends person{
    String add;
    
    @Override
    void dis(){
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Name "+add);
        System.out.println("Age "+age);
    }
}
public class overriding {
    public static void main(String[] args) {
        teacher t=new teacher();
        t.add="Naogaon Rajshahi Dhaka";
        t.age=22;
        t.name="Prosenjit";
        t.dis();
        person p=new person();
        p.age=20;
        p.name="Pety";
        p.dis();
    }
}
