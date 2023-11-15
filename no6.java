/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSet09Array;

/**
 *
 * @author HP
 */
public class no6 {
    public static int find(int[] arr, int item){
        int i=0,l=arr.length;
        if(arr==null)
        {
            return -1;
        }
        while(i<l)
        {
            if(arr[i]==item)
                return i+1;
            else
                i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
        System.out.println("Index position of 2458 is : "+find(arr,2458));
        System.out.println("Index position of 2013 is : "+find(arr,2013));
    }
}
