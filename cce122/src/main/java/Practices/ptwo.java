/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

class superclass{
    int data;
    public int getdata(){
        return data;
    }
    public void setdata(int data){
        this.data=data;
    }
}
class subclaas extends superclass{
    int data2;

    public subclaas(int data,int data2) {
        super.setdata(data);
        this.data2 = data2;
    }

    public subclaas() {
        this(0,0);
    }
    public boolean checkcondition(){
        if (super.data==10&&data2==15) {
            return true;
        }
        return false;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public void setData(int data) {
        super.setdata(data);
    }

    public int getData() {
        return super.getdata();
    }
    
}
public class ptwo {
    public static void main(String[] args) {
        subclaas sb=new subclaas(10,15);
        System.out.println(sb.checkcondition());
        sb.setData(0);
        System.out.println(sb.getData());
        System.out.println(sb.checkcondition());
    }
}
