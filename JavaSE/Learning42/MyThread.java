package JavaSE.Learning42;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 10:18
 */
public class MyThread extends Thread{
    private Socket socket;
    public MyThread(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            String name= UUID.randomUUID().toString().replace("-","");
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\陈宇浩\\Desktop\\"+name+".txt");
//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            BufferedInputStream bufferedInputStream=new BufferedInputStream(this.socket.getInputStream());
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            int len;
//        char[] chars=new char[1024];
            byte[] bytes=new byte[1024];
            while ((len= bufferedInputStream.read(bytes))!=-1){
                //            bufferedWriter.write((char) len);
                bufferedOutputStream.write(bytes,0,len);

            }
            bufferedOutputStream.flush();
            OutputStream outputStream = this.socket.getOutputStream();
            String back="收到了";
            outputStream.write(back.getBytes());


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                this.socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
