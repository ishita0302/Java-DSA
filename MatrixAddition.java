import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the number of rows and columns of the matrices:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Check if rows and columns are positive
        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid dimensions! Rows and columns must be positive.");
            return;
        }

        // Declare matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input matrix 1
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (sc.hasNextInt()) {
                    matrix1[i][j] = sc.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    return;
                }
            }
        }

        // Input matrix 2
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (sc.hasNextInt()) {
                    matrix2[i][j] = sc.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    return;
                }
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Output the result matrix
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
