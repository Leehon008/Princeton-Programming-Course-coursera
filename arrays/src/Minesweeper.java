public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] matrix = new int[m][n];
        for (int i = 0; i < k; i++) {
            int row = (int) (Math.random() * m);
            int col = (int) (Math.random() * n);
            while (matrix[row][col] == -1) {
                row = (int) (Math.random() * m);
                col = (int) (Math.random() * n);
            }
            matrix[row][col] = -1;

        }
        for (int i = 0; i < m; i++) {
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    System.out.print("*  ");
                    continue;
                }
                // System.out.println("i is " + i + "j is " + j);
                for (int u = i - 1; u < (i + 2) && u < m; u++) {
                    for (int v = j - 1; v < (j + 2) && v < n; v++) {
                        // System.out.println("u is " + u + "v is " + v);
                        if (u < 0 || v < 0) {
                            continue;
                        }
                        if (matrix[u][v] == -1) {
                            matrix[i][j] += 1;
                        }
                    }
                }
                // System.out.println("---------------");
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }


    }
}