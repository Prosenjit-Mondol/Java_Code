/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practics;

import java.util.Scanner;


public class addTWOBinary {
    public static void main(String[] args) {
        long b1,b2;
        int i=0,r=0;
        Scanner in=new Scanner(System.in);
        int[] sum=new int[20];
        System.out.println("Input 1st binary num: ");
        b1=in.nextLong();
        System.out.println("Input 2nd binary num: ");
        b2=in.nextLong();
        while(b1!=0 || b2!=0)
        {
            sum[i++]=(int)((b1%10 +b2%10 +r)%2);
            r=(int)((b1%10 +b2%10 +r)/2);
            b1/=10;
            b2/=10;
        }
        if (r!=0) {
            sum[i++]=r;
        }
        --i;
        while(i>=0)
        {
            System.out.print(sum[i--]);
        }
        System.out.println("\n");
    }
}
