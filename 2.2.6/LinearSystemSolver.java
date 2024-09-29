import javax.swing.JOptionPane;

public class LinearSystemSolver {
    public static void main(String[] args) {
 
        String strA11 = JOptionPane.showInputDialog(null, "Please input the coefficient a11:", "Input Coefficient a11", JOptionPane.INFORMATION_MESSAGE);
        String strA12 = JOptionPane.showInputDialog(null, "Please input the coefficient a12:", "Input Coefficient a12", JOptionPane.INFORMATION_MESSAGE);
        String strB1 = JOptionPane.showInputDialog(null, "Please input the constant b1:", "Input Constant b1", JOptionPane.INFORMATION_MESSAGE);
        
        String strA21 = JOptionPane.showInputDialog(null, "Please input the coefficient a21:", "Input Coefficient a21", JOptionPane.INFORMATION_MESSAGE);
        String strA22 = JOptionPane.showInputDialog(null, "Please input the coefficient a22:", "Input Coefficient a22", JOptionPane.INFORMATION_MESSAGE);
        String strB2 = JOptionPane.showInputDialog(null, "Please input the constant b2:", "Input Constant b2", JOptionPane.INFORMATION_MESSAGE);
        
        // Parse the input strings to doubles
        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double b1 = Double.parseDouble(strB1);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b2 = Double.parseDouble(strB2);
        
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        String result;

        if (D == 0) {
            // Check if D1 and D2 are also zero
            if (D1 == 0 && D2 == 0) {
                result = "The system has infinitely many solutions.";
            } else {
                result = "The system has no solution.";
            }
        } else {
            // If D is not zero, calculate the solutions for x1 and x2
            double x1 = D1 / D;
            double x2 = D2 / D;
            result = "The solution to the system is:\n" +
                     "x1 = " + x1 + "\n" +
                     "x2 = " + x2;
        }

        JOptionPane.showMessageDialog(null, result, "Solution", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
