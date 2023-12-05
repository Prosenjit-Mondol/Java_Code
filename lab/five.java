
package lab;

class re{
    int length,bredth;

    public re(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }
    
    public int getarea(){
        return length*bredth;
    }
    
    public int getperimeter(){
        return 2*(length+bredth);
    }
}

class squ extends re{

    public squ(int si) {
        super(si,si);
    }
    
}
public class five {
    public static void main(String[] args) {
        squ[] ss=new squ[15];
        for (int i=0;i<ss.length;i++) {
            ss[i]=new squ(1+i);
        }
         for (int i = 0; i <ss.length; i++) {
             System.out.println("Area of square: "+ss[i].getarea());
        }
       
    }
}