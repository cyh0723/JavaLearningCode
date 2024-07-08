package JavaSE.Learning22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/22 9:40
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");

        //匿名内部类
        c.forEach(s-> System.out.println(s));

    }
}
