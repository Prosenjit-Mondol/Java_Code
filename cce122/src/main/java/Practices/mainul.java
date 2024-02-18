/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MT;

class Multi extends Thread{
    int num;
    public void res(){
        for (int i = 0; i <num; i++) 
            System.out.println("with multi threading loop no."+num+".");
        
        
    }

    public Multi(int num) {
        this.num = num;
    }
}
public class mainul {
    static void loop(int num){
        for (int i = 0; i <num; i++) {
            System.out.println("without multi threading loop no ."+num);
        }
    }
    public static void main(String[] args) {
        loop(10);
        loop(5);
        loop(3);
        loop(1);
        System.out.println("**********");
        System.out.println("**********");
        Multi loop1 = new Multi(10);
        Multi loop2 = new Multi(5);
        Multi loop3 = new Multi(3);
        Multi loop4 = new Multi(1);
        
        loop1.start();
        loop2.start();
        loop3.start();
        loop4.start();
    }
}
