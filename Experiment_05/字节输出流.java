import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter("D:/ss.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;

            for (int i = 0; i < 2; i++) {
                line = in.nextLine();
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
