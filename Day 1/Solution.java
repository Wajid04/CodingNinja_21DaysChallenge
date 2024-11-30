public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0.0;

        // Use a switch-case structure to calculate the area based on the choice
        switch (ch) {
            case 1:
                // Area of circle = π * r^2
                area = Math.PI * Math.pow(a[0], 2);
                break;
            case 2:
                // Area of rectangle = l * b
                area = a[0] * a[1];
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        // Return the computed area
        return area;
    }

    public static void main(String[] args) {
        // Example test case
        double[] a1 = {3};  // Circle with radius 3
        double[] a2 = {3, 2};  // Rectangle with length 3 and breadth 2

        // Calculate area for choice 1 (circle)
        System.out.printf("%.5f\n", areaSwitchCase(1, a1));  // Expected output: 28.27433

        // Calculate area for choice 2 (rectangle)
        System.out.printf("%.5f\n", areaSwitchCase(2, a2));  // Expected output: 6.00000
    }
}
