/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSet09Array;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class no8 {
    public static void main(String[] args) {
        int[] arr={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        System.out.println("Original Array :"+Arrays.toString(arr));
        int[] new_arr=new int[100];
        //System.arraycopy(arr, 0, new_arr, 0, arr.length);
        for(int i=0;i<arr.length;i++)
        {
            new_arr[i]=arr[i];
        }
        System.out.println("New Array :"+Arrays.toString(new_arr));
    }
}
