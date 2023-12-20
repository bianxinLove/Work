package exercise;

import java.io.IOException;
import java.net.*;

public class exercise1 {
    public static void main(String[] args) throws IOException { //UDP发送数据
        DatagramSocket datagramSocket = new DatagramSocket();

        String str = "我是忭忻！！！";
        byte[] bytes = str.getBytes();
        InetAddress allByName = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, allByName, port);

        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
