import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Toi la Tung. Xin chao " + result + "!");
        System.exit(0);
    }
}