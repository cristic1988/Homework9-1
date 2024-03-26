import java.util.Arrays;
import java.util.Random;


public class MatrixProgramme {
    public static void main(String[] args) {
        int[][] matrix = new int[8][8];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(8);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                Arrays.sort(new int[]{matrix[i][j]});
                System.out.print(Arrays.toString(new int[]{matrix[i][j]}) + " ");

            }

            System.out.println();


        }

    }
}


