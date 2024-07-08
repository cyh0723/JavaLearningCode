package JavaSE.Learning25;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/24 10:07
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double yuwen;
    private double shuxue;
    private double yinyu;

    public Student() {
    }

    public Student(String name, int age, double yuwen, double shuxue, double yinyu) {
        this.name = name;
        this.age = age;
        this.yuwen = yuwen;
        this.shuxue = shuxue;
        this.yinyu = yinyu;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return yuwen
     */
    public double getYuwen() {
        return yuwen;
    }

    /**
     * 设置
     * @param yuwen
     */
    public void setYuwen(double yuwen) {
        this.yuwen = yuwen;
    }

    /**
     * 获取
     * @return shuxue
     */
    public double getShuxue() {
        return shuxue;
    }

    /**
     * 设置
     * @param shuxue
     */
    public void setShuxue(double shuxue) {
        this.shuxue = shuxue;
    }

    /**
     * 获取
     * @return yinyu
     */
    public double getYinyu() {
        return yinyu;
    }

    /**
     * 设置
     * @param yinyu
     */
    public void setYinyu(double yinyu) {
        this.yinyu = yinyu;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", yuwen = " + yuwen + ", shuxue = " + shuxue + ", yinyu = " + yinyu + "}";
    }

    public double sum(){
        return this.yuwen+this.shuxue+this.yinyu;
    }

    @Override
    public int compareTo(Student o) {
        double result;
        double sum_result=this.sum()-o.sum();
        double yuwen_resut=this.yuwen-o.yuwen;
        double shuxue_result=this.shuxue-o.shuxue;
        double yinyu_result=this.yinyu-o.yinyu;
        int age_result=this.age-o.age;
        result = (sum_result == 0 ? yuwen_resut : sum_result);

        return 0;
    }
}
