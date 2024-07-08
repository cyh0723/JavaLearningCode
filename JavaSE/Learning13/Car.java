package JavaSE.Learning13;

import java.util.Objects;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/3/18 14:20
 */
public class Car {
    private String carName;
    private int carAge;
    private String carColor;

    public void show(){
        System.out.println(carAge);
        Engine e=new Engine();
        System.out.println(e.engineName);
    }

    Engine getInstance(){
        return new Engine();
    }
    private class Engine{
        private String engineName;
        private int engineAge;

        static int a;

        public void show(){
            System.out.println(engineName);
            System.out.println(carAge);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Engine engine = (Engine) o;
            return engineAge == engine.engineAge && Objects.equals(engineName, engine.engineName);
        }


    }
}
