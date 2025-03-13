import javax.swing.JOptionPane;

public class simple {
          public static void main(String args[]){
                    String name = JOptionPane.showInputDialog("Enter your name");
                    JOptionPane.showMessageDialog(null,"Hello "+name);
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
                    JOptionPane.showMessageDialog(null," you are "+ age + " years old");
                    Double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height"));
                    JOptionPane.showMessageDialog(null,"You are "+height+" feet high");


          }
}
