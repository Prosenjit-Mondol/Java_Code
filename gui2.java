import javax.swing.JOptionPane;
public class gui2 {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Who are you?");

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));

        double hight=Double.parseDouble(JOptionPane.showInputDialog("Enter your hight:"));

        JOptionPane.showMessageDialog(null, "Hello "+name);
        JOptionPane.showMessageDialog(null, "You are "+age+" years old.");
        JOptionPane.showMessageDialog(null,"You hight is "+hight+" cm.");

        
    }
}
