/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class pascal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int c = 1;
        int n=in.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                if (i==0||j==0) {
                    c=1;
                }
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
        for (int i =n-2; i>=0; i--) {
            for (int j =n-1; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                if (i==0||j==0) {
                    c=1;
                }
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
