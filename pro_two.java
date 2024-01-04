/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

abstract class Bank {
    abstract int getBalance();
}
class BankA extends Bank {
    int balance = 100;
    //@Override
    public int getBalance() {
        return balance;
    }
}
class BankB extends Bank {
    int balance = 150;
    //@Override
    public int getBalance() {
        return balance;
    }
}
class BankC extends Bank {
    int balance = 200;
    //@Override
    public int getBalance() {
       return balance;
    }
}
public class pro_two {
    public static void main(String[] args) {
            BankA a=new BankA();
            System.out.println(a.getBalance());
            
            BankB b=new BankB();
            System.out.println(b.getBalance());;
            
            BankC c=new BankC();
            System.out.println(c.getBalance());
    }
}
