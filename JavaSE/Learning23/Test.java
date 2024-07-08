package JavaSE.Learning23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/22 10:35
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("1");
        list.add("2");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
