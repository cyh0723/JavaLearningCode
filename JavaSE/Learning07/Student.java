package JavaSE.Learning07;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/12 21:41
 */
public class Student {
    private String name;
    private int ages;


    public Student() {
    }

    public Student(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return ages
     */
    public int getAges() {
        return ages;
    }

    /**
     * 设置
     * @param ages
     */
    public void setAges(int ages) {
        this.ages = ages;
    }

    public String toString() {
        return "Student{name = " + name + ", ages = " + ages + "}";
    }
}
