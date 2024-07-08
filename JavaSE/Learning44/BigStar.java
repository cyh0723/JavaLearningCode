package JavaSE.Learning44;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 13:54
 */
public class BigStar implements Star{
    private String name;
    public BigStar(String name) {
        this.name=name;
    }

    @Override
    public String sing(String name) {
        System.out.println("在唱歌"+this.name);
        return "11";
    }

    @Override
    public void dance() {
        System.out.println("在跳舞");
    }
}
