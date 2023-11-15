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
public class no33 {
    public static void main(String[] args) {
        int nums[] = {20, 20, 30, 40, 50, 50, 50};
        System.out.println("Original array length: "+nums.length+"\nArray elements are :"+Arrays.toString(nums));
        System.out.println("\\nThe new length of the array is: "+sort(nums));
    }
    
    public static int sort(int[] nums){
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[index - 1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
