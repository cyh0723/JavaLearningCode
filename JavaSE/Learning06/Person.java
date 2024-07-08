package JavaSE.Learning06;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/11 21:42
 */
public class Person {
    private String name;
    private String password;
    private String gender;


    public Person() {
    }

    public Person(String name, String password, String gender) {
        this.name = name;
        this.password = password;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
        return "Person{name = " + name + ", password = " + password + ", gender = " + gender + "}";
    }
}
