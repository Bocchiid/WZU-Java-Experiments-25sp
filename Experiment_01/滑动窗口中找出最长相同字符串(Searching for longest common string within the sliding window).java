import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;
        int windowSize;

        s1 = input.next();
        s2 = input.next();
        windowSize = input.nextInt();

        int i, j, k;
        int length = 0;
        int maxlength = 0;
        int maxi = 0;
        int maxj = 0;

        for (i = 0; i < s1.length(); i++) {
            for (j = 0; j < s2.length(); j++) {
                length = 0;

                if (s1.charAt(i) != s2.charAt(j)) {
                    continue;
                }

                for (k = 0; k < windowSize; k++) {
                    if (i + k >= s1.length() || j + k >= s2.length()) {
                        break;
                    }

                    if (s1.charAt(i + k) == s2.charAt(j + k)) {
                        length++;
                    }
                }

                if (length > maxlength) {
                    maxlength = length;
                    maxi = i;
                    maxj = j;
                }
            }

            if (length > maxlength) {
                maxlength = length;
                maxi = i;
                maxj = j;
            }
        }

        for (i = maxi, j = maxj; i < s1.length() && j < s2.length(); i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                break;
            } else {
                System.out.print(s1.charAt(i));
            }
        }

        System.out.println();
    }
}
