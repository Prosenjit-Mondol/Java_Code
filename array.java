import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[5];
        int l=arr.length,s=0;
        int max=0;
        System.out.print("Enter 5 element of array ");
        for (int i = 0; i< l; i++) {
            arr[i]=in.nextInt();
            s+=arr[i];
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Sum of the total elements is "+s+"\n"+"Max is "+max);
        Arrays.sort(arr);
        for(int e:arr)
        {
            System.out.println(e);
        }


    }
}
