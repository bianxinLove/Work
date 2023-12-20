package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class exercise4 {//TCP协议 接收数据

    public static void main(String[] args) throws IOException {

//        String replace = UUID.randomUUID().toString().replace("-", "");
//        System.out.println(replace);

        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

//        InputStream is = socket.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int b;
        while ( ( b = br.read() ) != -1 ) System.out.print((char)b);

        socket.close();
        ss.close();
    }
}
