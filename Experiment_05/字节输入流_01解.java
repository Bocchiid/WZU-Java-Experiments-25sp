import java.io.*;

public class Main {
    public static void main(String[] args) {
        /** stream(流) */
        /** 1.字节流, 2.字符流 */
        /** 字节流: 以字节的视角来看, 操作二进制的东西 */
        /** 字符流: 以字符的视角来看, 操作字符 */
        /** 字符流: 帮你自动将字节转换成了字符 */

        /** FileStream(文件流) */
        /** stream: inputstream, outstream */

        try {
            FileInputStream fileInputStream = new FileInputStream("D:/text.txt");
            byte []s = new byte[1024]; /** 一个内存块的大小 */
            int len = 0;

            while ((len = fileInputStream.read(s)) != -1) {
                System.out.println(new String(s, 0, len));
            }

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            /** buffer(缓冲) 提高速度 */
//            byte []s = new byte[1024];
//            int len = 0;
//
//            while ((len = bufferedInputStream.read(s)) != -1) {
//                System.out.println(new String(s, 0, len));
//            }

//            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
//            String line = null;
//
//            while ((line = dataInputStream.readLine()) != null) {
//                System.out.println(line);
//            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
