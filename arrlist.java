import java.util.ArrayList;
public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer>num= new ArrayList<>();
        num.add(2);
        num.add(8);
        num.add(2003);
        boolean check=num.isEmpty();
        System.out.println(check);
        boolean c=num.contains(8);
    }
}
