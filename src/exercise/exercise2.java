package exercise;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class exercise2 {
    public static void main(String[] args) throws IOException {//接收UDP数据
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        //System.out.println("1111111111111");

        ds.receive(dp);

        //System.out.println("2222222222222222222");

        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println(new String(data,0,len) + " -> " +  address + " -> " + port);
    }
}
