package JavaSE.Learning43;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 10:33
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
       Student s=new Student("chen",10);
       saveObject(s);

    }

    private static void saveObject(Object object) throws IllegalAccessException {
        Class aClass = object.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Object o = declaredField.get(object);
            System.out.println(name+"="+o);
        }
    }
}
