package JavaSE.Learning10;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/13 20:59
 */
public class Main {
    public static void main(String[] args) {
        Animal dog=new Dog(2,"黑色");
        Animal cat=new Cat(3,"灰色");
        Person p1=new Person("老王",30);
        Person p2=new Person("老李",25);

        p1.keepPet(dog,"骨头");
        p2.keepPet(cat,"鱼");


    }
}
