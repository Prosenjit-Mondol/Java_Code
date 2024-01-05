/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_Ha;

/**
 *
 * @author HP
 */
public class i {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/5;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e+"occurs");
        }
        System.out.println("Rest of the code");
    }
}
