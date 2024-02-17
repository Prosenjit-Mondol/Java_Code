/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

interface smart{
    void poweron();
}
interface remote extends smart{
    void poweroff();
}
class tv implements remote{
    @Override
    public void poweron(){
        System.out.println("Power is on");
    }
    @Override
    public void poweroff(){
        System.out.println("Power is off");
    }
}
public class abeight {
    public static void main(String[] args) {
        tv t=new tv();
        t.poweroff();
        t.poweron();
    }
}
