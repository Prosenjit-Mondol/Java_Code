/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;

class point{
    private int x;
    private int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class quardrilateral{
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public quardrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }
    public double A(){
        return (double) Math.sqrt(Math.pow(getPoint2().getX() - getPoint1().getX(), 2)+ Math.pow(getPoint2().getY() - getPoint1().getY(), 2));
    }
    public double B() {
   return (double) Math.sqrt(Math.pow(getPoint3().getX() - getPoint2().getX(), 2)+ Math.pow(getPoint3().getY() - getPoint2().getY(), 2));
    }
    
}
public class inseven {
    
}
