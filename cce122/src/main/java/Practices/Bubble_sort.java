/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class Bubble_sort {
    static void bubbleSort(int[] arr){
        int temp,n=arr.length;
        for (int i = 0; i <n; i++) {
            for (int j =1; j <n; j++) {
                if (arr[j-1]>arr[j]) {
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the Size of Array: ");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int k = 0; k <size; k++) {
            arr[k]=in.nextInt();
        }
        
        bubbleSort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
