import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        /** Internet */
        /** Ip:每个设备唯一的地址 */
        /** InetAddress */
        /** DNS */
        /** Port:定位到软件 */
        /** 1 - 65565 */
        /** Socket */

        /** TCP UDP */

        /** TCP */


        try {
            Scanner in = new Scanner(System.in);

            Socket socket = new Socket("127.0.0.1", 25565);

            OutputStream outputStream = socket.getOutputStream();

            for (int i = 0; i < 3; i++) {
                String line = in.nextLine();
                outputStream.write(line.getBytes(), 0, line.getBytes().length);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
