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
public class no14 {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));
        
        HashSet set=new HashSet();
        
        for (String array11 : array1) {
            for (String array21 : array2) {
                // Check if elements in array1 and array2 are equal.
                if (array11.equals(array21)) {
                    // Add the common element to the HashSet.
                    set.add(array11);
                }
            }
        }
        System.out.println("Common element : " + (set));
    }
}
