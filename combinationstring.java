public class combinationstring {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printcomb(String str,int ind,String com)
    {
        if(ind==str.length())
        {
            System.err.println(com);
            return;
        }
        char curchar=str.charAt(ind);
        String mapping=keypad[curchar-'0'];

        for(int i=0;i<mapping.length();i++)
        {
            printcomb(str, ind+1, com+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="6666"; 
        printcomb(str, 0, "");
    }
}
