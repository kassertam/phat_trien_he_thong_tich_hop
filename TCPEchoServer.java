import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
    public final static int serverPort = 7;

public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Server created");
            while(true){
                try{
                    Socket s= ss.accept();
                    OutputStream os= s.getOutputStream();
                    InputStream is= s.getInputStream();
                    int ch=0;
                    while(true){
                        ch= is.read();
                        if(ch==-1) break;
                        System.out.println((char)ch);
                        os.write(ch);
                    }
                    s.close();
                }catch(IOException ie1){
                    System.out.println("Ket noi loi: " + ie1);
                }
            }
        }catch(IOException ie){
            System.out.println("Server loi tao ket noi: " +ie);
        }
    }
}