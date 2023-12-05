
package lab;
class tangle{
    int length,breadth;

    public tangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int are(){
        return length*breadth;
    }
    public int perim(){
        return 2*(length+breadth);
    }
}
class squa extends tangle{
    
    public squa(int side) {
        super(side,side);
    }
}
public class six {
    public static void main(String[] args) {
        tangle re=new tangle(10,20);
        System.out.println("Rectangle Area: "+re.are());
        System.out.println("Rectangle Perimeter: "+re.perim());
        
        squa sq=new squa(10);
        System.out.println("Square Area: "+sq.are());
        System.out.println("Square Perimeter: "+sq.perim());
    }
}
