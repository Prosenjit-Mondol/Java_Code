/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

interface str{
    void poweron();
}
interface tr extends str{
    void poweroff();
}
class tv implements tr{
    @Override
    public void poweron(){
        System.out.println("Power is on now");
    }
    @Override
    public void poweroff(){
        System.out.println("Power is off now");
    }
}
public class pro_eight {
    public static void main(String[] args) {
        tv t=new tv();
        t.poweron();
        t.poweroff();
    }
}
