package JavaSE.Learning38;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/2 12:35
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10086);

        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        InputStreamReader isr=new InputStreamReader(inputStream);

        int b;
        while ((b=isr.read())!=-1){
            System.out.println((char) b);
        }
        inputStream.close();
        accept.close();
        serverSocket.close();


    }
}
