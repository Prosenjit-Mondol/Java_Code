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
public class no19 {
    public static void main(String[] args) {
        String[] my_array = new String[] {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList list = new ArrayList(Arrays.asList(my_array));
        System.out.println(list);
        String[] my_array2 = new String[list.size()];
         list.toArray(my_array2);
         System.out.println("Array list to array :"+Arrays.toString(my_array2));
         
    }
}
