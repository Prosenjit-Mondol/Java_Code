
package lab;

class parent{
    void pri(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    void ppp(){
        System.out.println("This is child class");
    }
}
 public class one{
     public static void main(String[] args) {
         parent p=new parent();
         child c=new child();
         p.pri();
         c.ppp();
         c.pri();
     }
 }