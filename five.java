/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB12;
import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s1=in.nextLine();
        String s2=in.nextLine();
        
        int r=s1.compareTo(s2);
        if (r<0) {
            System.out.println("\""+s1+"\""+" is less than "+"\""+s2+"\"");
        }
        else if (r==0) {
            System.out.println("\""+s1+"\""+" is equal to "+"\""+s2+"\"");
        }
        else{
            System.out.println("\""+s1+"\""+" is greater than "+"\""+s2+"\"");
        }
    }
}

