/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

abstract class bank{
    abstract int getbalance();
}
class bankA extends bank{
    int b=100;

    @Override
    public int getbalance() {
        return b;
    }
    
}
class bankB extends bank{
    int b=150;

    @Override
    public int getbalance() {
        return b;
    }
    
}
class bankC extends bank{
    int b=200;

    @Override
    public int getbalance() {
        return b;
    }
    
}
public class abtwo {
    public static void main(String[] args) {
        bankA a=new bankA();
        System.out.println(a.getbalance());
        bankB b=new bankB();
        System.out.println(b.getbalance());
        bankC c=new bankC();
        System.out.println(c.getbalance());
    }
}
