/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class sorted {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String []arr=new String[5];
        System.out.println("Enter five string:");
        for (int i = 0; i <5; i++) {
            arr[i]=in.next();
        }
        System.out.println("Original array : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array : "+Arrays.toString(arr));   
    }
}
