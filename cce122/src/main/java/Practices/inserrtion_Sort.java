/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class inserrtion_Sort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the Size of Array: ");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int k = 0; k <size; k++) {
            arr[k]=in.nextInt();
        }
        
        for (int i = 1; i <arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>-1&&(arr[j]>key)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
