package JavaSE.Learning12;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/15 10:43
 */
public class PingPongAthlete extends Athlete implements LearningEnglish{
    public PingPongAthlete() {
    }

    public PingPongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learningSports() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void learningEnglish() {
        System.out.println("说英语");
    }
}
