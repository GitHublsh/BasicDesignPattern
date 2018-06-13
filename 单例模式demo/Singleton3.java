package singleton;

/**
 * Created by liushihan on 2018/6/13.
 */
//枚举
public class Singleton3 {
    public enum SingletonInstance {
        INSTANCE;

        public void doSomething() {
            //do something
            System.out.println("Do Something");
        }
    }

    public static void main(String[] args){
        SingletonInstance.INSTANCE.doSomething();
    }
}
