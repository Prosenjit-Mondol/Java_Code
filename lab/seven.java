
package lab;

class quadrilaterial{
    private int x1,y1,x2,y2,x3,y3,x4,y4;
    private double l1,l2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    
    
    public quadrilaterial(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public quadrilaterial(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        
        l1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        l1=Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        
    }
    public void display(){
        System.out.println((l2*l1));
    }
}
class trapezoid extends quadrilaterial{

    public trapezoid(double a, double b, double c) {
        super(a+b,c);
    }
    
}
class parallelogram extends quadrilaterial{

    public parallelogram(double base, double height) {
        super(base, height);
    }
    
}
class ectangle extends parallelogram{

    public ectangle(double base, double height) {
        super(base, height);
    }
    
}
class quare extends quadrilaterial{

    public quare(double side) {
        super(side, side);
    }
    
}

public class seven {
    public static void main(String[] args) {
        quadrilaterial obqq=new quadrilaterial(2,5,8,9,6,7,11,4);
        
        trapezoid obz=new trapezoid(10,7,8);
        
        parallelogram obpa=new parallelogram(15,18);
        
        ectangle obr=new ectangle(12,16);
        
        quare oba=new quare(8);
        
        System.out.println("The area of Quadrilateral is ");
        obqq.display();
        
        System.out.println("The area of Trapoziod is ");
        obz.display();
        
        System.out.println("The area of Parallelogram is ");
        obpa.display();
        
        System.out.println("The area of Rectangle is ");
        obr.display();
        
        System.out.println("The area of Square is ");
        oba.display();
    }
}
