import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class ArrarySample1 {
    public static void printArary(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrix = new double[2][2];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter" + matrix.length + "rows and" + matrix[0].length + "columns:");
        for (int row = 0; row < matrix.length; row++) {
            for (int columns = 0; columns < matrix[row].length; columns++) {
                matrix[row][columns] = input.nextInt();
            }

        }
        printArary(matrix);

        //二维组数的和
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int columns = 0; columns < matrix[row].length; columns++) {
                sum += matrix[row][columns];
                System.out.println("sum=" + sum);
            }
        }

        System.out.println();

        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
                System.out.println("Sum for column" + column + "is" + total);
            }

            int maxRow = 0;
            int indexOfMaxRoe = 0;

            for (column = 0; column < matrix[0].length; column++) {
                maxRow += matrix[0][column];
            }
            for (int row = 1; row < matrix.length; row++) {
                int totalOfThisRow = 0;
                for (column = 0; column < matrix[row].length; column++) {
                    totalOfThisRow += matrix[row][column];
                }
                if (totalOfThisRow > maxRow) {
                    maxRow = totalOfThisRow;
                    indexOfMaxRoe = row;

                }
            }
            System.out.println("Row" + indexOfMaxRoe + "maxvalue:" + maxRow);

            //随机打乱数组
            for (int i=0;i<matrix.length;i++) {
                for (int j=0;j<matrix[i].length;j++) {
                  int i1 = (int)(Math.random()*matrix.length);
                  int j1 = (int)(Math.random()*matrix[i1].length);
                  //swap matrix[i][j] with matrix[i1][j1]
                    double temp = matrix[i][j];
                    matrix[i][j] = matrix[i1][j1];
                    matrix[i1][j1] = temp;
                }
            }
            printArary(matrix);

        }
    }
}