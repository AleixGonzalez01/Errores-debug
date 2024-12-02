package ERRORES;

public class ERRORES{

	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz original:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            	transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        try {
            System.out.println("\nAccediendo al elemento en [2][0]: " + matrix[2][0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: " + e.toString());
        }

        try {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {  
                for (int j = 0; j < matrix[i].length; j++) { 
                    sum += matrix[i][j];
                }
            }
            System.out.println("\nLa suma de los elementos es: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError al intentar sumar: " + e.toString());
        }
	}

  }