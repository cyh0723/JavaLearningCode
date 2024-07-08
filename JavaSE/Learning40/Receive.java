package JavaSE.Learning40;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/6 19:42
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);
        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            System.out.println("接收到数据"+new String(data,0, length));
            System.out.println("长度："+length);
            System.out.println("发送地址："+address);
            System.out.println("发送端口："+port);

            if (new String(data,0, length).equals("886")){
                ds.close();
            }
        }

    }
}
