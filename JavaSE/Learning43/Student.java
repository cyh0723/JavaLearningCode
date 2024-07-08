package JavaSE.Learning43;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 10:38
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Student(int age){
        this.age=age;
    }
    protected Student(String name) {
        this.name=name;
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

    public void study(){
        System.out.println("学生在学习");
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
