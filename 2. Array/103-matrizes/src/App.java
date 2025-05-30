import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        List<Integer> diagonal = new ArrayList<>();
        int negativos = 0;

        // Leitura dos dados:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Percorrendo toda a matriz e salvando diagonal e números negativos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    diagonal.add(matrix[i][j]);
                }

                if (matrix[i][j] < 0) {
                    negativos++;
                }
            }
        }

        // Loop alternativo: percorrendo a matriz usando a função length
        // Uma matriz é um array de arrays
        // length retorna o número de linhas: `matrix.length`
        // dentro de cada linha vão estar as colunas `matrix[i].length`
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // }
        // }

        // Solução alternativa, percorrendo somente a diagonal:
        // for (int i = 0; i < n; i++) {
        // System.out.print(matrix[i][i] + " ");
        // }

        System.out.println("Main diagonal:");
        for (Integer item : diagonal) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Negative numbers: " + negativos);

        sc.close();
    }
}
