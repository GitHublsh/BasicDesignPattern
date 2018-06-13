package singleton;

/**
 * Created by liushihan on 2018/6/13.
 */
//懒汉式
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if (null == instance){
            synchronized (Singleton1.class){
                if (null == instance){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}