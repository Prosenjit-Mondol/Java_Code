/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MT;

class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread"+name+":"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread"+name+"interrupted.");
            }
        }
        System.out.println("Thread"+name+"finished.");
    }
}
public class tanvir {
    public static void main(String[] args) {
        Thread thread1=new Thread(new MyRunnable("Thread 1"));
        Thread thread2=new Thread(new MyRunnable("Thread 2"));
        thread1.start();
        thread2.start();
    }
}
