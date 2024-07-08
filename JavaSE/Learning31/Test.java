package JavaSE.Learning31;

import java.io.*;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/20 15:05
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("JavaSE/Learning31/test/dam");
        File txt=new File(file,"aaa.txt");
        System.out.println(file.getPath());
    }
}
