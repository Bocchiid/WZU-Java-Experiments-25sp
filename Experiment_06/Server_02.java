import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        try {
            DatagramSocket datagramSocket = new DatagramSocket(8888);

            while (true) {
                byte[] s = new byte[1024];

                DatagramPacket datagramPacket = new DatagramPacket(s, 0, s.length);
                datagramSocket.receive(datagramPacket);

                System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
                //break;
            }

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
