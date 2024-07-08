package JavaSE.Learning36;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/1 20:32
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        InetAddress name = InetAddress.getByName("小陈的酷炫ROG");
//        System.out.println(name.getHostName());
//        System.out.println(name.getHostAddress());
//        DatagramSocket ds=new DatagramSocket();
//        String str="你好";
//        byte[] bytes = str.getBytes();
//        InetAddress inetAddress = InetAddress.getByName("192.168.1.6");
//        int port=10001;
//        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,inetAddress,port);
//        ds.send(dp);
//        ds.close();
        DatagramSocket ds=new DatagramSocket();
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入你要说的话：");
            String str= sc.nextLine();
            if ("886".equals(str))
                break;
            byte[] bytes = str.getBytes();
            DatagramPacket dp=new DatagramPacket(bytes, bytes.length,InetAddress.getByName("192.168.1.6"),10086);
            ds.send(dp);
        }
        ds.close();
    }
}
