import java.util.*;
public class sorting {
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array: ");
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int arr[]=new int[l+1];
        System.out.println("Enter the element of array:");
        for (int index = 0; index <l; index++) {
            arr[index]=in.nextInt();
        }
        //bubble sort
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     for(int j=0;j<arr.length-1-i;j++)
        //     {
        //         if(arr[j]>arr[j+1])
        //         {
        //             int t=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=t;
        //         }
        //     }
        // }
        //selectio sort

        // for(int j=0;j<arr.length;j++)
        // {
        //     int s=0;
        //     for(int i=j+1;i<arr.length;i++)
        //     {
        //         if(arr[s]>arr[i])
        //         {
        //             s=i;
        //         }
        //     }
        //     int temp=arr[s];
        //     arr[s]=arr[j];
        //     arr[j]=temp;
        // }

        //insertion sort

        for(int i=1;i<=arr.length;i++)
        {
            int c=arr[i];
            int j=i-1;
            while(j>=0 && c<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=c;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
