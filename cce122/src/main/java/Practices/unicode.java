/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

/**
 *
 * @author HP
 */
public class unicode {
    public static void main(String[] args) {
        String str="Prosenjit";
        System.out.println("Original String :"+str);
        int v1=str.codePointAt(0);
        int v2=str.codePointAt(8);
        System.out.println(v1+" "+v2);
    }
}
