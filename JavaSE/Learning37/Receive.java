package JavaSE.Learning37;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/2 12:26
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms=new MulticastSocket(10086);

        //将本机ip加入到组播地址当中
        InetAddress address=InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);

        ms.receive(dp);

        byte[] data=dp.getData();

        System.out.println(new String(data,0, dp.getLength()));
        ms.close();
    }
}
