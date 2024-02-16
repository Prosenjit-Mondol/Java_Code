/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class character_rhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            char s='A';
            for (int j = 0; j <=i; j++) {
                System.out.print(s);
                s++;
            }
            s--;
            for (int j = 0; j <i; j++) {
                s--;
                System.out.print(s);
            }
            System.out.println("");
        }
        for (int i = n-2; i>=0; i--) {
            for (int j =n; j>i; j--) {
                System.out.print(" ");
            }
            char ss='A';
            for (int j = 0; j <=i; j++) {
                System.out.print(ss);
                ss++;
            }
            ss--;
            for (int j = 0; j <i; j++) {
                ss--;
                System.out.print(ss);
            }
            System.out.println("");
        }
    }
}
