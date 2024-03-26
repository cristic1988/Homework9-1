import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Який розмір бажаєте отримати? ->");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        if (n % 2 == 0) {
//            for (int i = 0; i < n / 2; i++) {
//                a[i] = a[n - i - 1] = i + 1;
//            }
//        } else {
//            for (int i = 0; i <= n / 2; i++) {
//                a[i] = a[n - i - 1] = i + 1;
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }
//    public static void main(String[] args) {
//        Random random = new Random();


//        int[] matrix = new int[] {random.nextInt(8)};
//        System.out.println(matrix.toString());
//        System.out.println("Змінена матриця");
//        int[] temp =
//        for (int i = 0; i < matrix.length; i++) {
//            temp = matrix;
//            if (i % 2 == 0) {
//                for (int j = temp.length - 1; j >= 0; j--) {
//                    System.out.printf("%7d", temp[j]);
//                }
//            } else {
//                for (int j = 0; j < temp.length; j++) {
//                    System.out.printf("%7d", temp[j]);
//                }
//            }
//            System.out.println();
//        }
//    }
//}
