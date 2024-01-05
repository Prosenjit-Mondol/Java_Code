/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_Ha;

class ExceptA extends Exception {
    public ExceptA(String message) {
        super(message);
    }
}
class ExceptB extends ExceptionA {
    public ExceptB(String message) {
        super(message);
    }
}
class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}
public class iii {
    public static void main(String[] args) {
        try {
          throw new ExceptionB("Exception of type ExceptonB");
        } catch (ExceptionA e) {
            System.out.println(e);
        }
        try {
          throw new ExceptionC("Exception of type ExceptonC");
        } catch (ExceptionA e) {
           System.out.println(e);
        }
    }
}

