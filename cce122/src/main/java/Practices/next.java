/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

/**
 *
 * @author HP
 */
public class next {
    public static void main(String[] args) {
        float f=0.2f;
        System.out.println("Initial floating number: "+f);
        float ne=Math.nextDown(f);
        float up=Math.nextUp(f);
        System.out.println(ne);
        System.out.println(up);
    }
}
