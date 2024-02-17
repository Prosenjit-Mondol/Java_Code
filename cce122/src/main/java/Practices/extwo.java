/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class extwo {
    public static void main(String[] args) {
        float real;
        System.out.println("Enter the real number:");
        Scanner in=new Scanner(System.in);
        real=in.nextFloat();
        in.close();
        try{
        if (real<0) {
            throw new IllegalArgumentException("The number must not be negative");
            
        }
        System.out.println("Square root is "+Math.sqrt(real));
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
}
