class Rectangular{

    int length,breath;
    public Rectangular(int length,int breath){
        this.length=length;
        this.breath=breath;
    }
    public int area(){
        return length*breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
}
class Square extends Rectangular{
    public Square(int side){
        super(side, side);
    }
}
public class four {
    public static void main(String[] args) {
        Rectangular rectangle = new Rectangular(10, 20);
System.out.println("Rectangle Area: " + rectangle.area());
System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
Square square = new Square(10);
System.out.println("Square Area: " + square.area());
System.out.println("Square Perimeter: " + square.perimeter());

    }
}
