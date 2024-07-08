package JavaSE.Learning11;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/14 14:07
 * 抽象类不能实例化
 * 抽象类中不一定有抽象方法  但是有抽象方法的一定是抽象类
 */
public abstract class Person {
    private String name;
    private int age;
    private String gender;


    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }

    public abstract void work();
}
