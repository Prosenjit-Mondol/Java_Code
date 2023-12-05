
package lab;

class rectangle{
    int length,wedth;

    public rectangle(int length, int wedth) {
        this.length = length;
        this.wedth = wedth;
    }
    public int area(){
        return length*wedth;
    }
    public int perimeter(){
        return 2*(length+wedth);
    }
}
class square extends rectangle{

    public square(int side) {
        super(side,side);
    }
}
public class four {
    public static void main(String[] args) {
        rectangle re=new rectangle(10,20);
        System.out.println("Rectangle Area: "+re.area());
        System.out.println("Rectangle Perimeter: "+re.perimeter());
        
        square sq=new square(10);
        System.out.println("Square Area: "+sq.area());
        System.out.println("Square Premeter: "+sq.perimeter());
    }
}
