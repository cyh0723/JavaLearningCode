package JavaSE.Learning12;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/15 10:41
 */
public abstract class Athlete extends Person{
    public abstract void learningSports();

    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }
}
