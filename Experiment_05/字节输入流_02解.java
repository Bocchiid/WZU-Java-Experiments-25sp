import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** stream(流) */
        /** 1.字节流, 2.字符流 */
        /** 字节流: 以字节的视角来看, 操作二进制的东西 */
        /** 字符流: 以字符的视角来看, 操作字符 */
        /** 字符流: 帮你自动将字节转换成了字符 */

        /** FileStream(文件流) */
        /** stream: inputstream, outstream */

        /** stream(字节流) */
        /** er(字符流) */
        /** reader(输入流) writer(输出流) */

        try {
            FileReader fileReader = new FileReader("D:/text.txt");

            char []s = new char[1024];
            int len = 0;

            while ((len = fileReader.read(s)) != -1) {
                System.out.println(new String(s, 0, len));
            }
            /** 关闭字符流(好习惯) */
            fileReader.close();

//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
