/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;


public class person {
    String name;
    int age;
    String hair;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    person(String name,int age,String hair){
        this(name,age);
        this.hair=hair;
    }
    void display(){
        System.out.println("Name :"+name+" Age:"+age+"Hair Color :"+hair);
    }
}
