package JavaSE.Learning21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/17 15:29
 */
public class Test {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("xiaochen", "xiaolv");
        m.put("xiaozhang","xiaopi");
        m.put("xiaoji","xiaob");

//        //通过键找值遍历
//        Set<String> strings = m.keySet();
//        for (String string : strings) {
//            String string1 = m.get(string);
//            System.out.println(string1);
//        }

        //通过键值对遍历
        for (Map.Entry<String, String> entry : m.entrySet()) {
            System.out.println(entry);
        }

        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+"="+s2);
            }
        });

        m.forEach((String s1,String s2)->{
            System.out.println(s1+"="+s2);
        });


    }
}
