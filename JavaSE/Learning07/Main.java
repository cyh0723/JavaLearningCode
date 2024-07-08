package JavaSE.Learning07;

import java.util.ArrayList;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/12 21:23
 */
public class Main {
    //为什么要有集合  因为数组长度是固定的  但是集合不能直接存基本数据类型 只能存包装类
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("xiaochen",10);
        Student s2=new Student("xiaolv",20);
        list.add(s1);
        list.add(s2);

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+"  "+student.getAges());
        }
    }
}
