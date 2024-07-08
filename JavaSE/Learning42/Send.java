package JavaSE.Learning42;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/6 22:40
 */
public class Send {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),10086);
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\陈宇浩\\Desktop\\服务器.txt");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,len);
            System.out.println(new String(bytes,0,len));
        }
        bufferedOutputStream.flush();
        socket.shutdownOutput();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(bufferedReader.readLine());

        socket.close();
    }
}
