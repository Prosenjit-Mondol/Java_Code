import javax.swing.JOptionPane;
public class guigui {
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("Enter your account name:");

        JOptionPane.showMessageDialog(null, "Welllcome to your "+name+" account");

        int num=Integer.parseInt(JOptionPane.showInputDialog(name+"\n"+"1.Case Out\n2.Send Money\n3.Mobile Recharge\n4.Payment\n5.Bill Pay\n6.My Nagad\n7.PIN Reset"));
        switch (num) {
            case 1:
                {
                    String number=JOptionPane.showInputDialog("Enter Uddokta a/c Number:");
                    int amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                    int pin=Integer.parseInt(JOptionPane.showInputDialog("Case Out\n"+"To:"+number+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Case Out\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Case Out\n"+"To: "+number+"\nAmount: Tk "+amount+" was successfull.");
                                break;
                            }
                        }
                        
                    }
                }
                break;

            case 2:
                {
                    String number=JOptionPane.showInputDialog("Enter Received Account Number:");
                    int amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                    String ref=JOptionPane.showInputDialog("Enter Refferance:");
                    int pin=Integer.parseInt(JOptionPane.showInputDialog("Case Out\n"+"To:"+number+"\nAmount: Tk "+amount+"Ref: "+ref+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"Send Money\n"+"To: "+number+"\nAmount: Tk "+amount+"Ref: "+ref+" was successfull.");
                    else
                    {
                        while (pin!=1111) {
                            int wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"Send Money\n"+"To: "+number+"\nAmount: Tk "+amount+"Ref: "+ref+" was successfull.");
                                break;
                            }
                        }
                        
                    }
                }
                break;
        
            default:
                break;
        }

        JOptionPane.showMessageDialog(null,"you are "+num+" years old");




        double hight=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));


        JOptionPane.showMessageDialog(null,name+"You are "+hight+" cm tall.");
    }
}
