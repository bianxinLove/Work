package exercise;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class exercise3 {
    public static void main(String[] args) throws IOException { // TCP协议 发送数据
        Socket socket = new Socket("127.0.0.1",10000);
        OutputStream os = socket.getOutputStream();

        os.write("忭忻".getBytes());

        socket.shutdownOutput();

        os.close();
        socket.close();
    }
}
