/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSet09Array;

/**
 *
 * @author HP
 */
import java.util.Arrays;
public class no34 {
    public static void main(String[] args) {
        int[] arr={49, 1, 3, 200, 2, 4, 70, 5}; 
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1])
                c++;
        }
        System.out.println(c);
    }
}
