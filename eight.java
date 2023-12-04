/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB12;

public class eight {
    public static void main(String[] args) {
        String str1 = "example.com", str2 = "Example.com";
        CharSequence cs = "example.com";
        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
         System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));
    }
 
}
