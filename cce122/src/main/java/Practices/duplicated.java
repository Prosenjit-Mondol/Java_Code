/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

/**
 *
 * @author HP
 */
public class duplicated {
    public static void main(String[] args) {
        String[] arr={"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i].equals(arr[j])&&i!=j) {
                    System.out.println("Duplicated Element is: "+arr[j]);
                }
            }
        }
    }
}
