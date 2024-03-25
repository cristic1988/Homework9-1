import java.util.Random;

public class MatrixProgramme {

    public static void main(String[] args) {
        Random random = new Random();
        int[] matrix = new int[] {random.nextInt(8)};
        System.out.println(matrix.toString());
        System.out.println("Змінена матриця");
        int[] temp =
        for (int i = 0; i < matrix.length; i++) {
            temp = matrix;
            if (i % 2 == 0) {
                for (int j = temp.length - 1; j >= 0; j--) {
                    System.out.printf("%7d", temp[j]);
                }
            } else {
                for (int j = 0; j < temp.length; j++) {
                    System.out.printf("%7d", temp[j]);
                }
            }
            System.out.println();
        }
    }
}
