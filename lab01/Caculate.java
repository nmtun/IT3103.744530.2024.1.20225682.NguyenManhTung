import javax.swing.JOptionPane;

public class Caculate {
    public static void main(String[] args) {
        String strNum1, strNum2; 
        String strSum = "Sum of two double numbers: ";
        String strDifference = "Diference of two double number: ";
        String strProduct = "Product of two double number: ";
        String strQuotient = "Quotient of two double number: ";
        strNum1 = JOptionPane.showInputDialog(null,
                 "Please enter the first number:","Input the first number",
                 JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null,
                 "Please enter the second number:","Input the second number",
                 JOptionPane.INFORMATION_MESSAGE);  
        double num2 = Double.parseDouble(strNum2);
        strSum += num1 + num2;
        strDifference += Math.abs(num1 - num2);
        strProduct += num1 * num2;
        JOptionPane.showMessageDialog(null, strSum,
                    "NMTung 20225682 show sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strDifference,
                    "NMTung 20225682 show difference of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, strProduct,
                    "NMTung 20225682 show product of two numbers", JOptionPane.INFORMATION_MESSAGE);
        //check division
        if(num2 == 0) {
            JOptionPane.showMessageDialog(null, "Can not to devisor because num2=0",
                        "NMTung 20225682 caculate", JOptionPane.INFORMATION_MESSAGE);
        } else {
            strQuotient += num1 / num2;
            JOptionPane.showMessageDialog(null, strQuotient,
                        "NMTung 20225682 show quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
