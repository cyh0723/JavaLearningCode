package JavaSE.Learning16;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/19 13:25
 */
public class Main {
    public static void main(String[] args) {
        String[] s=new String[]{"uhdrfih","guiwf","gudisgh","dhiu","dbui","huiodfdff"};

        Arrays.sort(s,(s1,s2)->s1.length()-s2.length());
        System.out.println(Arrays.toString(s));
    }




}
