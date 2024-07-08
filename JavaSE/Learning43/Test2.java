package JavaSE.Learning43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 11:51
 */
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("prop.properties"));
        System.out.println(properties);

        String name = (String) properties.get("classname");
        String method = (String) properties.get("method");

        Class<?> aClass = Class.forName(name);
        Constructor<?> constructor = aClass.getConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();

        Method declaredMethod = aClass.getDeclaredMethod(method);
        declaredMethod.invoke(o);


    }
}
