package JavaSE.Learning41;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/6 20:24
 */
public class Send {
    public static void main(String[] args) throws IOException {
//        Socket socket=new Socket(InetAddress.getLocalHost(),10086);
        Scanner sc=new Scanner(System.in);
//        OutputStream outputStream = socket.getOutputStream();
        while (true) {
            Socket socket=new Socket(InetAddress.getLocalHost(),10086);
            System.out.println("请输入你要发送的信息：");
            String str=sc.nextLine();
            if (str.equals("886")){
                socket.close();
                break;
            }

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(str.getBytes());
            socket.shutdownOutput();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            int len;
            while ((len=inputStreamReader.read())!=-1){
                System.out.print((char) len);

            }
            socket.close();
        }


    }
}
