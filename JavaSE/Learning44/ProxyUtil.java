package JavaSE.Learning44;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/7/8 14:03
 */
public class ProxyUtil {
    public static Star createProxy(BigStar bigStar){
        Star star = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理需要的功能
                        if (method.getName().equals("sing")){
                            System.out.println("准备唱歌");
                            return method.invoke(bigStar,args);
                        }else if(method.getName().equals("dance")){
                            System.out.println("准备跳舞");
                            return method.invoke(bigStar,args);
                        }else {
                            return method.invoke(bigStar,args);
                        }


                    }
                });
        return star;
    }
}
