public class palindomik {
    public static void main(String[] args) {
        int n=5;
        for(int j=1;j<=n;j++)
        {
            for(int i=1;i<=n-j;i++)
            {
                System.out.print(" ");
            }
            for(int i=j;i>=1;i--)
            System.out.print(i);
            for(int i=2;i<=j;i++)
            System.out.print(j);
            System.out.println();
        }
    }
}
