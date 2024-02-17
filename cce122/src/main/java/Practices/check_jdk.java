/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

/**
 *
 * @author HP
 */
public class check_jdk {
    public static void main(String[] args) {
        System.out.println("Java version "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version "+System.getProperty("java.runtime.version0"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));

        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }
}
