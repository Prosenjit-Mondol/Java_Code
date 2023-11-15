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
public class no7 {
    public static void main(String[] args) {
        int[] arr={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        System.out.println("Original Array :"+Arrays.toString(arr));
        int r=2;
        for(int i=r;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println("After removing Array element :"+Arrays.toString(arr));
    }
}
