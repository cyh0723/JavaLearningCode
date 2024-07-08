package JavaSE.Learning36;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/1 21:39
 */
public class Receive {
    public static void main(String[] args) throws IOException {
//        DatagramSocket ds=new DatagramSocket(10001);
//        byte[] bytes=new byte[1024];
//        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
//        ds.receive(dp);//程序在这里是阻塞的
//
//        byte[] data = dp.getData();
//        int len=dp.getLength();
//        InetAddress address = dp.getAddress();
//        int port = dp.getPort();
//
//        System.out.println("接受的数据"+new String(data,0,len)+port);

        DatagramSocket ds=new DatagramSocket(10086);
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        while (true) {

            ds.receive(dp);
            byte[] data = dp.getData();

            System.out.println("已收到"+new String(dp.getData(),0,dp.getLength()));
        }

    }
}
