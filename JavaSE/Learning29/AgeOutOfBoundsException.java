package JavaSE.Learning29;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/5/20 13:37
 */
public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
