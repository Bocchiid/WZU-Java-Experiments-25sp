import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(25565);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            byte []s = new byte[1024];
            int len = 0;

            while ((len = inputStream.read(s)) != -1) {
                System.out.println(new String(s, 0, len));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
