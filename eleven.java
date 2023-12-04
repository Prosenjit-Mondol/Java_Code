/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB12;

import java.util.Calendar;
public class eleven {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
         
        System.out.println("Current Date and Time :");
        
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n",c,c,c);
    }
}
