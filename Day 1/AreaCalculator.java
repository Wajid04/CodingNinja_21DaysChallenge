import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's choice
        System.out.println("Enter your choice (1 for circle, 2 for rectangle): ");
        int ch = scanner.nextInt();

        // Create an array to store input values
        double[] a = new double[2]; 

        // Based on the choice, input the respective values
        if (ch == 1) {
            System.out.println("Enter the radius of the circle: ");
            a[0] = scanner.nextDouble();
        } else if (ch == 2) {
            System.out.println("Enter the length and breadth of the rectangle: ");
            a[0] = scanner.nextDouble();
            a[1] = scanner.nextDouble();
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        // Calculate and display the area based on the choice
        double area = 0;
        switch(ch) {
            case 1:
                // Area of circle = π * r^2
                area = Math.PI * Math.pow(a[0], 2);
                System.out.println("Area of the circle: " + String.format("%.2f", area));
                break;
            case 2:
                // Area of rectangle = l * b
                area = a[0] * a[1];
                System.out.println("Area of the rectangle: " + area);
                break;
        }

        scanner.close();
    }
}
