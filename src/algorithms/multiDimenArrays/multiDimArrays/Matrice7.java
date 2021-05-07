package algorithms.multiDimenArrays.multiDimArrays;
//1007

import java.io.*;
import java.util.Scanner;

public class Matrice7 {
    public static void main(String[] args) throws IOException {
        int n, m;
        Scanner scanner = new Scanner(new File("E:\\Programming exercises\\src\\algorithms\\mArrays\\mArrays\\matrice7.in"));
        FileWriter writer = new FileWriter("E:\\Programming exercises\\src\\algorithms\\mArrays\\mArrays\\matrice7.out");
        n = scanner.nextInt();
        m = scanner.nextInt();
        System.out.println(n + " " + m);
        int[][] matrix = new int[n][m];
        int max = -1;
        int min = 1000000;

        try {
            writer.write(n + " " + m);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] == max) {
                    matrix[i][j] = min;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                try {
                    writer.write(matrix[i][j] + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.write("\n");
        }
        writer.close();
    }
}

