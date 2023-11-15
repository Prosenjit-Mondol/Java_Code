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
public class no27 {
    public static void main(String[] args) {
        int[] aa=new int[10];
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 10 element of the array: ");
        for(int i=0;i<10;i++){
            aa[i]=in.nextInt();
            if(aa[i]==10){
                sum+=aa[i];
            }
        }
        if(sum==30){
            System.out.println("True");
        }
        else
            System.out.println("false");
        
    }
}
