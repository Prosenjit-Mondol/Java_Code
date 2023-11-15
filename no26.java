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
public class no26 {
    
    public static void main(String[] args) {
        int[] array_nums = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        int i = 0;
        System.out.println("Original array "+Arrays.toString(array_nums));
        for (int j = 0, l = array_nums.length; j < l;) {
            if (array_nums[j] == 0)
                j++;
            else {
                // Swap the non-zero element with the first available zero.
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
                j++;
            }
        }
        while (i < array_nums.length)
            array_nums[i++] = 0;
        System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : array_nums)
            System.out.print(n + "  ");
        System.out.print("\n");
    }
}
