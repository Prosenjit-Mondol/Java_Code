/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_Ha;

import java.util.*;
public class ii {
    public static void main(String[] args) {
        float r;
        System.out.print("Enter a real number: ");
        Scanner s = new Scanner(System.in);
        r = s.nextFloat();
        //s.close();
        try {
            if (r< 0)
                throw new IllegalArgumentException("The numbermust not be negative");
            System.out.println("Square root is "+Math.sqrt(r));
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }
        System.out.println("rest of the code...");
    }
}
