package JavaSE.Learning42;

import java.util.UUID;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 10:06
 */
public class UUIDTest {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }
}
