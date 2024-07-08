package JavaSE.Learning08;

import java.util.StringJoiner;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/12 22:55
 */
public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String result(int[] arr){
        StringJoiner sj=new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            String c=String.valueOf(arr[i]);
            sj.add(c);
        }
        return sj.toString();
    }
}
