/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSet09Array;

/**
 *
 * @author HP
 */
import java.util.*;
public class no16 {
    public static void uniqe_array(int[] arr)
    {
        System.out.println("Original arrays :"+Arrays.toString(arr));
        int l=arr.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]==arr[j])
                {
                    arr[j]=arr[l-1];
                    l--;j--;
                }
            }
        }
        int[] arr1=Arrays.copyOf(arr, l);
        System.out.println("Array with unique value :"+Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        uniqe_array(new int[] {0, 3, -2, 4, 3, 2});
        uniqe_array(new int[] {10, 22, 10, 2, 11, 22});
    }
}
