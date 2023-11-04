import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of array: ");
        int l=in.nextInt();
        int arr[]=new int[l+1];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<l;i++)
        {
            arr[i]=in.nextInt();
        }
        //insertion sort

        for(int i=1;i<l;i++)
        {
            int c=arr[i];
            int j=i-1;
            while(j>=0 && c<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=c;
            
        }
        for(int i=0;i<l;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
