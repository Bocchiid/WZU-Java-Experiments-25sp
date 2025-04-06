import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        int i, j;
        int k;

        m = input.nextInt();
        n = input.nextInt();

        int a[][] = new int[m + 2][n + 2];
        int dir[][] = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                a[i][j] = input.nextInt();
            }
        }

        for (i = 1; i <= m; i++) {
            for (j = 1; j<= n; j++) {
                int b[] = new int[8];
                int length = 0;
                int sum = 0;

                for (k = 0; k < 8; k++) {
                    if (a[i + dir[k][0]][j + dir[k][1]] > a[i][j]) {
                        b[length] = 0;
                        length++;
                    } else {
                        b[length] = 1;
                        length++;
                    }
                }

                for (int l = length - 1; l >= 0; l--) {
                    sum = sum * 2 + b[l];
                }

                System.out.printf("%4d", sum);
            }

            System.out.println();
        }
    }
}
