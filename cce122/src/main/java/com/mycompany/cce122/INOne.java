/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cce122;

class one{
    void print1(){
        System.out.println("This is parent class");
    }
}
class two extends one{
    void print(){
        System.out.println("This is child clas");
    }
}
public class INOne {
    public static void main(String[] args) {
        two t=new two();
        t.print();
        t.print1();
    }
}
