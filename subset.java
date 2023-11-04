import java.util.*;

public class subset {

    public static void print(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++)
        System.out.print(subset.get(i)+" ");
        System.out.println();
    }
    public static void findSubSet(int n,ArrayList<Integer> subset)
    {
        if(n==0)
        {
            print(subset);
            return ;
        }

        //add hoga
        subset.add(n);
        findSubSet(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubSet(n-1, subset);
    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset= new ArrayList<>();
        findSubSet(n,subset);
    }
}
