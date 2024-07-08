package JavaSE.Learning27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/7 13:39
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三风");

//        ArrayList<String> list2=new ArrayList<>();
//        for (String s : list1) {
//            if (s.startsWith("张"))
//                list2.add(s);
//        }
//
//        System.out.println(list2);
//        ArrayList<String> list3=new ArrayList<>();
//        for (String s : list2) {
//            if (s.length()==3)
//                list3.add(s);
//        }
//        System.out.println(list3);

        list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length()==3).forEach(name -> System.out.println(name));

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Integer[] array = list.stream().filter(num -> num % 2 == 0).toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(array));


    }
}
