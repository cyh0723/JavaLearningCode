package JavaSE.Learning18;
import JavaSE.Learning18.Cat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/1 20:22
 */
public class Main {
    public static void main(String[] args) {

    }

    public static  void keepPet(ArrayList<? extends Cat> list){
        for (Cat e : list) {
            e.eat();
        }
    }

}
