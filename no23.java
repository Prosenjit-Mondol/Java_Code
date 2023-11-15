/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSet09Array;

/**
 *
 * @author HP
 */

public class no23 {
   static void checking(int[] arr,int[] arr2){
       boolean eq=true;
       if(arr.length==arr2.length){
           for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    eq = false;
                }
            }
       }
       else{
           eq=false;
       }
       if(eq){
           System.out.println("Two arrays are equal.");
       }
       else
       {
           System.out.println("Two arrays are not equal");
       }
   } 
    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 8, 11};
        int[] array3 = {2, 5, 7, 9, 11};
        checking(array1, array2);
        checking(array1, array3);
    }
}
