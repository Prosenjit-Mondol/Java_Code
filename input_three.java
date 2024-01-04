/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;


class pizza{
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    public String getSize() {
        return size;
    }
    public final void setSize(String size) {
        if(size.equals("small")||size.equals("medium")||size.equals("large"))
        this.size = size;
        else
            System.out.println("Invalid size");
    }

    public int getCheese() {
        return cheese;
    }
    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }
    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }
    public void setHam(int ham) {
        this.ham = ham;
    }
    
    public pizza(String size,int cheese,int pepperoni,int ham){
        this.cheese=cheese;
        setSize(size);
        this.ham=ham;
        this.pepperoni=pepperoni;
    }

    public pizza() {
        this("small",0,0,0);
    }
    public double calcCost(){
        double cost=0;
        switch(size){
            case "small":
                cost=10;
                break;
            case "medium":
                cost=12;
                break;
            case "large":
                cost = 14;
               break;
        }
        cost =cost+(cheese+pepperoni+ham)*2.0;
        return cost;
    }
    
    public String getdescription(){
        return "Pizza{" +
               "size='" + size + '\'' +
               ", cheeseToppings=" + cheese+
               ", pepperoniToppings=" + pepperoni +
               ", hamToppings=" + ham +
               ", cost=" + calcCost() +
               '}';
    }
    
}
public class input_three {
    public static void main(String[] args) {
        pizza p1=new pizza();
        pizza p2=new pizza("medium",2,3,4);
        pizza p3=new pizza("small",3,3,4);
        p3.setSize("large");
        System.out.println(p1.getdescription());
        System.out.println(p2.getdescription());
        System.out.println(p3.getdescription());
    }
}
