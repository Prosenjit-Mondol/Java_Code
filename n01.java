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
public class n01 {
    public static void main(String[] args) {
        int[] arr={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        String[] arr2={"java","c++","c","php","phython"};
        System.out.println("Original array :"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array :"+Arrays.toString(arr));
        System.out.println("Original array :"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted array :"+Arrays.toString(arr2));
        
    }
}
