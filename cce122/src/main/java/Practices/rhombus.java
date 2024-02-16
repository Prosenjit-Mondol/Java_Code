/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class rhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            int s=i+1;
            for (int j = 0; j <=i; j++) {
                System.out.print(s);
                s--;
            }
            s++;
            for (int j = 0; j <i; j++) {
                s++;
                System.out.print(s);
            }
            System.out.println("");
        }
        for (int i = n-2; i>=0; i--) {
            for (int j =n; j>i; j--) {
                System.out.print(" ");
            }
            int s=i+1;
            for (int j = 0; j <=i; j++) {
                System.out.print(s);
                s--;
            }
            s++;
            for (int j = 0; j <i; j++) {
                s++;
                System.out.print(s);
            }
            System.out.println("");
        }
    }
}
