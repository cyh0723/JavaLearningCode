package JavaSE.Learning42;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/6 22:40
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,16,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        ServerSocket serverSocket=new ServerSocket(10086);
        while (true) {
            Socket socket = serverSocket.accept();
//            new MyThread(socket).start();
            pool.submit(new MyThread(socket));
        }
//        serverSocket.close();
    }
}
