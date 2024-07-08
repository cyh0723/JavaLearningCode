package JavaSE.Learning37;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/2 12:23
 */
public class Send {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms=new MulticastSocket();


        String name="你好！";
        byte[] bytes=name.getBytes();
        InetAddress address=InetAddress.getByName("224.0.0.1");//要指定组播地址
        int port=10086;
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,address,port);
        ms.send(dp);
        ms.close();
    }
}
