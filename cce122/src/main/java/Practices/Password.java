/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.io.Console;
import java.util.Arrays;

public class Password {
    public static void main(String[] args) {
        Console cons = System.console();
        if (cons != null) {
            char[] pass = null;
            try {
                pass = cons.readPassword("Input your password:");
                System.out.println("Your password was: " + new String(pass));
            } finally {
                if (pass != null) {
                    Arrays.fill(pass, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get the password...No console");
        }
    }
}
