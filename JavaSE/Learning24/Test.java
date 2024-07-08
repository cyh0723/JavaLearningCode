package JavaSE.Learning24;

import LeetCode.Main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/22 21:24
 */
public class Test {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        Student st1=new Student("xiaoji","1","nan");
        Student st2=new Student("xiaoji","1","nan");
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
