package JavaSE.Learning15;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/18 20:50
 */
public class Main {
    public static void main(String[] args) {
        String phoneNumber="13312345678";
        System.out.println(checkPhoneNumber(phoneNumber));
    }
    public static boolean checkPhoneNumber(String phoneNumber){
        return phoneNumber.matches("^[GCDZTSPKXLY1-9]\\d{1,4}$");
    }
}
