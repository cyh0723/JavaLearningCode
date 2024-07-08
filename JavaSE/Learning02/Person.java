package JavaSE.Learning02;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/1 14:43
 */
public abstract class Person {
    private String name;
    private int age;
    private String sex;

    static String info="小陈在代码";
    public Person(String name,int age,String sex){

        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    void hello(){
        System.out.println("Hello,world!");
    }



    abstract void  modify(Worker worker);
}
