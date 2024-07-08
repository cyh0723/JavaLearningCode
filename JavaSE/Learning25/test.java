package JavaSE.Learning25;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/24 9:56
 */
public class test {
    public static void main(String[] args) {
        Student s1=new Student("001",15,76,86,25);
        Student s2=new Student("002",75,76,16,75);
        Student s3=new Student("003",87,76,86,49);
        Student s4=new Student("004",24,13,23,25);
        Student s5=new Student("005",85,43,99,24);

        TreeSet<Student> ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
    }
}
