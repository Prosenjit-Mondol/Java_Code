
package Practices;

class someclass{

    public someclass() throws Exception{
        throw new Exception("SomeClass constructor exception");
    }
}
public class exsix {
    public static void main(String[] args) {
        try{
            someclass sc=new someclass();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
