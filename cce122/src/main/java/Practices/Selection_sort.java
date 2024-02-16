/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class Selection_sort {
    public static void main(String[] args) {
        int size,temp;
        int arr[]=new int[50];
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the Size of Array: ");
        size=in.nextInt();
        System.out.println("Enter the array elements: ");
        for (int k = 0; k <size; k++) {
            arr[k]=in.nextInt();
        }
        
        System.out.println("Sorting array using Selection Sort");
        for (int k = 0; k <size; k++) {
            for (int i = k+1; i <size; i++) {
                if (arr[k]>arr[i]) {
                    temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        
        System.out.println("Now the array after Sorting ");
        
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
