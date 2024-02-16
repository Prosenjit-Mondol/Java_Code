/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class count_digit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion");
        if (in.hasNextLong()) {
            long n=in.nextLong();
            if (n<0) {
                n*=-1;
            }
            if (n>=100000000L) {
                System.out.println("Number is greater than 10,0000000");
            }
            else{
                int digits=1;
                if (n>=10&&n<100) {
                    digits=2;
                }
                else if (n >= 100 && n < 1000)
                {
                    digits = 3;
                }
                else if (n >= 1000 && n < 10000)
                {
                    digits = 4;
                }
                else if (n >= 10000 && n < 100000)
                {
                    digits = 5;
                }
                else if (n >= 100000 && n < 1000000)
                {
                    digits = 6;
                }
                else if (n >= 1000000 && n < 10000000)
                {
                    digits = 7;
                }
                else if (n >= 10000000 && n < 100000000)
                {
                    digits = 8;
                }
                else if (n >= 100000000 && n < 1000000000)
                {
                    digits = 9;
                }
                else if (n >= 1000000000 && n < 10000000000L)
                {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        }
        else{
            System.out.println("The number is not an integer");
        }
    }
 
}
