package JavaSE.Learning26;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/28 14:13
 */
public class Test {
    public static void main(String[] args) {
        //双列集合
        String s="efiugwigfiwguofhwohcybi";
        TreeMap<Character,Integer> t=new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (t.containsKey(c)){
                Integer index = t.get(c);
                t.put(c,++index);
            }else {
                t.put(c,1);
            }
        }

        System.out.println(t);
        int max=0;

    }
}
