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
public class no9 {
    public static void main(String[] args) {
        int[] arr={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        
        int index=5;
        int value=89;
        System.out.println("Original Arrays :"+Arrays.toString(arr));
        for(int i=arr.length-1;i>index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        System.out.println("New Arrays :"+Arrays.toString(arr));
    }
}
