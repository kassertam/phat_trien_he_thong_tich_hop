import java.io.*;
import java.net.Socket;

public class TCPEchoClient {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 7;

    public static void main(String[] args) throws InterruptedIOException {
        Socket s = null;
        try {
            s = new Socket(ServerIP, serverPort);
            System.out.println("Client da tao");
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            for (int i = '0'; i <= '9'; i++) {
                os.write(i);
                int ch = is.read();
                System.out.println((char) ch);
                Thread.sleep(2000);
            }
        } catch (IOException ie) {
            System.out.println("Loi: Khong the tao Socket");
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}