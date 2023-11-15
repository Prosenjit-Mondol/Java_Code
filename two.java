private class parent {
    public void pro(){
        System.out.println("This is parent class");
    }
}
 class child extends parent{
    public void pp(){
         System.out.println("This is child class");
    }
    
}
public class two {
    public static void main(String[] args) {
        parent ob=new parent();
        ob.pro();
        child bb=new child();
        bb.pp();
    }
}
