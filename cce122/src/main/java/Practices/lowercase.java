/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class lowercase {
    public static void main(String[] args) {
        String str;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the string: ");
            str = in.nextLine();
        }
        System.out.println(str.toLowerCase());
        //System.out.println(str.toLowerCase().toUpperCase());
        String[] word=str.split("[ ]+");
        String r=word[word.length-2];
        System.out.println("Penultimate word: "+r);
        char[] ch=r.toCharArray();
        for (int i =ch.length-1; i >=0; i--) {
            System.out.print(ch[i]);
        }
        String mid=" Puspo";
        String result=str.substring(0,5)+mid+str.substring(4);
        System.out.println(result);
        String copy=str.substring(str.length()-3);
        System.out.println(copy+copy+copy);
    }
}
