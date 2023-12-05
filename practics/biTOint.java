/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practics;

import java.util.*;
public class biTOint {
    public static void main(String[] args) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();

        // Initialize the quotient with the decimal number
        quot = dec_num;

        // Convert the decimal number to binary and store binary digits
        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        // Display the binary representation of the decimal number
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
