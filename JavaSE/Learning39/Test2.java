package JavaSE.Learning39;

import java.io.*;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/2 15:41
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("JavaSE/Learning39/a.txt");
        BufferedReader bf=new BufferedReader(fr);
//        char[] data=new char[2];
//        int len;
        String len;
        char[] data=new char[2];
        while ((len=bf.readLine())!=null){
            System.out.println(len);
        }
        bf.close();

//        FileWriter fw=new FileWriter("JavaSE/Learning39/a.txt",true);
//        fw.write("绿绿绿绿绿");
//        fw.close();
    }
}
