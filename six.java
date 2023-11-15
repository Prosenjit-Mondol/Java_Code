class Shape{
    public void print(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    public void print_R(){
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape{
    public void print_C(){
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle{
    public void print_s(){
        System.out.println("Square is a rectangle");
    }
}
public class six {
    public static void main(String[] args) {
        Square ob=new Square();
        ob.print();
        ob.print_R();
    }
}
