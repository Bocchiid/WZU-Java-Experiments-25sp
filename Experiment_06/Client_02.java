import java.io.OutputStream;
import java.net.*;
import java.nio.charset.StandardCharsets;
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
        /** 打电话 */

        /** UDP */
        /** 发短信 */

        /** User Datagram */

        /** Datagram */
        /** DatagramSocket DatagramPacket */
        try {
            DatagramSocket datagramSocket = new DatagramSocket(25565);

            Scanner in = new Scanner(System.in);

            while (true) {
                String s = in.nextLine();

                InetAddress inetAddress = InetAddress.getByName("localhost");

                DatagramPacket datagramPacket = new DatagramPacket(s.getBytes(), 0, s.getBytes().length, inetAddress, 8888);

                datagramSocket.send(datagramPacket);
                //break;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

