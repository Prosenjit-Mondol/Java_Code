/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        String givenString = in.nextLine();
        in.close();
        
        String[] words = givenString.split(" ");
        
        
        //StringBuilder reversedString = new StringBuilder();
        
        // Iterate over the words array in reverse order and append each word to the reversed string
        for (int i = words.length - 1; i >= 0; i--) {
//            reversedString.append(words[i]);
//            if (i != 0) {
//                reversedString.append(" "); // Add a space between words
//            }
System.out.print(words[i]+" ");
        }
        
        // Print the original and reversed strings
        //System.out.println("The given string is: " + givenString);
        //System.out.println("The new string after reversing the words: " + reversedString);
    }
}
