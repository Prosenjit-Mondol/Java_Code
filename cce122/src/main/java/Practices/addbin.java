/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

import java.util.*;
public class addbin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("First binary number:");
        String a=in.nextLine();
        System.out.println("Second binary number: ");
        String b=in.nextLine();
        System.out.println("Enter a Hexadecimal");
        String c=in.nextLine();
        System.out.println("Enter a Octal");
        String d=in.nextLine();
        in.close();
        int dd=Integer.parseInt(d,8);
        int cc=Integer.parseInt(c,16);
        int aa=Integer.parseInt(a,2);
        int bb=Integer.parseInt(b,2);
        int sum=aa*bb;
        System.out.println(cc+" "+dd);
        String result=Integer.toBinaryString(sum);
        String hex=Integer.toHexString(sum);
        String oc=Integer.toOctalString(dd);
        System.out.println(hex+" "+result+oc);
    }
}
