package JavaSE.Learning40;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/6 19:42
 */
public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(20000); //组播是multicast对象
        Scanner scanner=new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("886")){
                ds.close();
                break;
            }else {
                byte[] bytes=str.getBytes();
                try {
                    DatagramPacket dp=new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"),10086);
                    ds.send(dp);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
