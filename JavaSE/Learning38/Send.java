package JavaSE.Learning38;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/2 12:34
 */
public class Send {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10086);//连不上会报错

        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes());

        os.close();
        socket.close();

    }
}
