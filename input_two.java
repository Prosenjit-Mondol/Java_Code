/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

class superclass{
    int data1;
    
    public int getData1(){
        return data1;
    }
    public void setData1(int data1){
        this.data1=data1;
    }
}
class subclass extends superclass{
    int data2;
    public subclass(int data1,int data2){
        super.setData1(data1);
        this.data2=data2;
    }
    public subclass(){
        this(0,0);
    }
    public String checkcondition(){
        if(super.data1==10 && data2==15){
            return "Condition true";
        }
        return "condition false";
    }
    @Override
    public void setData1(int data1){
        super.setData1(data1);
    }
    @Override
    public int getData1(){
        return super.getData1();
    }
}
public class input_two {
    public static void main(String[] args) {
        subclass a=new subclass(10,15);
        System.out.println(a.checkcondition());
        
        a.setData1(0);
        System.out.println(a.getData1());
        System.out.println(a.checkcondition());
    }
}
