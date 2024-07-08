package JavaSE.Learning18;

import java.util.ArrayList;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/1 20:40
 */
public class ListUtils {
    private ListUtils(){}

    public static<E> void addAll(ArrayList<E> list,E element){
        list.add(element);
    }
}
