package JavaSE.Learning30;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/20 13:45
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String str="F:\\JavaLearning\\Code\\JavaSE\\Learning30";
        File f1=new File(str);
        System.out.println(Arrays.toString(File.listRoots()));


    }
}
