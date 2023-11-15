/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSet09Array;

/**
 *
 * @author HP
 */
public class no10 {
    public static void main(String[] args) {
        int[] arr={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        int maximum=arr[0],mini=arr[0];
        for(int i:arr){
            if(i>maximum)
                maximum=i;
            if(i<mini)
                mini=i;
        }
        System.out.println("Maximum value is "+maximum+"\nMinimum value is "+mini);
    }
}
