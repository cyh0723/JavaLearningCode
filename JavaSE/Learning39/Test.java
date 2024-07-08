package JavaSE.Learning39;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/2 12:46
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        File file=new File("JavaSE/Learning39/a.txt");
//        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
//        String str="你好";
//        fileOutputStream.write(str.getBytes());
//        String string="\r\n";
//        fileOutputStream.write(string.getBytes());
//        String s="123";
//        fileOutputStream.write(s.getBytes());
//        fileOutputStream.close();
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream("JavaSE/Learning39/a.txt");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
//            int len;
//            byte[] bytes=new byte[3];
//            while ((len=fileInputStream.read(bytes))!=-1){
//                System.out.println(new String(bytes,0,len, "GBK"));
//            }
            int len;
            while ((len=bufferedInputStream.read())!=-1){
                System.out.println((char) len);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
