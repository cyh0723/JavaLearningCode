package JavaSE.Learning28;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/7 16:12
 */
public class Test {
    public boolean stringCharge(String s){
        return s.startsWith("张")&&s.length()==3;
    }

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三分");
//        System.out.println(list);
//
////        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
////        list.stream().filter(new Predicate<String>() {
////            @Override
////            public boolean test(String s) {
////
////                return s.startsWith("张")&&s.length()==3;
////            }
////        }).forEach(s-> System.out.println(s));
//        StringOperation stringOperation=new StringOperation();
//        list.stream().filter(new Test()::stringCharge).forEach(System.out::println);


//        List<String> list = new ArrayList<>();
//        Collections.addAll(list,"张无忌-15","赵敏-14","张强-13","张三分-12","张良-11");
//
////        list.stream().map(new Function<String, Student>() {
////            @Override
////            public Student apply(String s) {
////                Student student=new Student(s.split("-")[0],Integer.parseInt(s.split("-")[1]));
////                return student;
////            }
////        }).collect(Collectors.toList());
//
//
//        list.stream().map(Student::new).forEach(System.out::println);

//        ArrayList<String> list=new ArrayList<>();
//        Collections.addAll(list,"aaa","bbb","ccc","ddd");
//        String[] array = list.stream().toArray(String[]::new);


    }
}
