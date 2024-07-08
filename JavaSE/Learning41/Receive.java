package JavaSE.Learning41;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.ServerError;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/6 20:24
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10086);
        InputStream inputStream = null;
        while (true) {
            Socket accept = serverSocket.accept();
            inputStream = accept.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            int len;
            while ((len=inputStreamReader.read())!=-1){
                System.out.print((char) len);
            }
            //服务端回写数据
            OutputStream outputStream = accept.getOutputStream();
            String back="收到了";
            outputStream.write(back.getBytes());
            inputStream.close();
            accept.close();
        }


    }
}
