/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

class pizza{
    private String size;
    private int cheesetopping;
    private int pepperoitopping;
    private int hamtopping;

    public String getSize() {
        return size;
    }

    public int getCheesetopping() {
        return cheesetopping;
    }

    public int getHamtopping() {
        return hamtopping;
    }

    public int getPepperoitopping() {
        return pepperoitopping;
    }

    public void setSize(String size) {
        if(size.equals("small")||size.equals("medium")||size.equals("large"))
        this.size = size;
        else
            System.out.println("Invalid size");
    }

    public void setCheesetopping(int cheesetopping) {
        this.cheesetopping = cheesetopping;
    }

    public void setPepperoitopping(int pepperoitopping) {
        this.pepperoitopping = pepperoitopping;
    }

    public void setHamtopping(int hamtopping) {
        this.hamtopping = hamtopping;
    }

    public pizza(String size, int cheesetopping, int pepperoitopping, int hamtopping) {
        this.size = size;
        this.cheesetopping = cheesetopping;
        this.pepperoitopping = pepperoitopping;
        this.hamtopping = hamtopping;
    }

    public pizza() {
        this("small",0,0,0);
    }
    public double cost(){
        double cost=0;
        switch(size){
            case "small" -> cost=10;
            case "medium" -> cost=12;
            case "large" -> cost=14;
        }
        cost =cost+ (cheesetopping+pepperoitopping+hamtopping)*2;
        return cost;
    }
    public String getdescription(){
        return "Pizza{"+"Size="+size+'\''+",cheesetoppings="+cheesetopping+",pepperoitopping="+pepperoitopping+",jamtopping="+hamtopping+",cost="+cost()+'}';
    }
}
public class pthree {
    public static void main(String[] args) {
        pizza p1=new pizza();
        pizza p2=new pizza("medium",2,4,6);
        pizza p3=new pizza("small",3,3,7);
        p3.setSize("large");
        
          System.out.println(p1.getdescription()); 
          System.out.println(p2.getdescription());
          System.out.println(p3.getdescription());
    }
}
