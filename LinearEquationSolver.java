import javax.swing.JOptionPane;

public class LinearEquationSolver {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog(null, "Please input the coefficient 'a'", "Input Coefficient 'a'", JOptionPane.INFORMATION_MESSAGE);
        
        // Convert the input string to a double
        double a = Double.parseDouble(strA);
        
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input! Coefficient 'a' cannot be zero for a first-degree equation.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String strB = JOptionPane.showInputDialog(null, "Please input the coefficient 'b':", "Input Coefficient 'b'", JOptionPane.INFORMATION_MESSAGE);
            double b = Double.parseDouble(strB);

            // ax + b = 0 (x = -b / a)
            double x = -b / a;

            String result = "The solution to the equation " + a + "x + " + b + " = 0 is x = " + x;
            JOptionPane.showMessageDialog(null, result, "Solution", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
