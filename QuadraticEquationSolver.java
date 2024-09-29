import javax.swing.JOptionPane;

public class QuadraticEquationSolver {
    public static void main(String[] args) {

        String strA = JOptionPane.showInputDialog(null, "Please input the coefficient 'a'", "Input Coefficient 'a'", JOptionPane.INFORMATION_MESSAGE);
        
        // Convert the input string to a double
        double a = Double.parseDouble(strA);
        
  
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input! Coefficient 'a' cannot be zero for a quadratic equation.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            String strB = JOptionPane.showInputDialog(null, "Please input the coefficient 'b':", "Input Coefficient 'b'", JOptionPane.INFORMATION_MESSAGE);
            String strC = JOptionPane.showInputDialog(null, "Please input the constant 'c':", "Input Constant 'c'", JOptionPane.INFORMATION_MESSAGE);
            
            // Convert the inputs to doubles
            double b = Double.parseDouble(strB);
            double c = Double.parseDouble(strC);

            // Δ = b^2 - 4ac
            double discriminant = b * b - 4 * a * c;
            String result;

            // Check the discriminant to determine the nature of the roots
            if (discriminant > 0) {
                // Two distinct real roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                result = "The equation has two distinct real roots:\n" +
                         "x1 = " + root1 + "\n" +
                         "x2 = " + root2;
            } else if (discriminant == 0) {
                // Double root (one real root)
                double root = -b / (2 * a);
                result = "The equation has a double root:\n" +
                         "x = " + root;
            } else {
                // No real roots (complex roots)
                result = "The equation has no real roots.";
            }

            JOptionPane.showMessageDialog(null, result, "Solution", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
