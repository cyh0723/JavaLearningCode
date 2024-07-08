package JavaSE.Learning39;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/4 21:08
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        Student s1=new Student("zhang",11,"南京");
        Student s2=new Student("chen",21,"北京");
        Student s3=new Student("wang",51,"天京");

        
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("JavaSE/Learning39/a.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.close();
    }
}
