/**
 * one
 */
class parent {
    public void pro(){
        System.out.println("This is parent class");
    }
}
 class child extends parent{
    public void pp(){
         System.out.println("This is child class");
    }
    
}
public class one{
    public static void main(String[] args) {
        parent p=new parent();
        p.pro();
        child ob=new child();
        ob.pp();
        ob.pro();
    }
}