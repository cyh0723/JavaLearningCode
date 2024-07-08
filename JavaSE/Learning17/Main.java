package JavaSE.Learning17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.SplittableRandom;
import java.util.function.Consumer;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/19 14:19
 */
public class Main {
    public static void main(String[] args) {
        Collection <String> s=new ArrayList<>();
        s.add("chenyuhao");
        s.add("lvqian");

        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        s.forEach(st-> System.out.println(st));


    }
}
