package JavaSE.Learning10;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/13 20:43
 */
public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

    public void keepPet(Animal a,String thing){
        if (a instanceof Dog){
            System.out.println("年龄为"+this.age+"的"+this.name+"养了一只"+a.getColor()+"的狗"+","+a.getAge()+"岁的"+a.getColor()+"的狗两只前腿死死的抱住骨头猛吃");
        }else
            System.out.println("年龄为"+this.age+"的"+this.name+"养了一只"+a.getColor()+"的猫"+","+a.getAge()+"岁的"+a.getColor()+"的猫眯着眼睛在吃鱼");



    }
}
