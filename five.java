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
public class five {
    public static void main(String[] args) {
        Square square = new Square(15);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
