package factory;

/**
 * Created by liushihan on 2018/6/11.
 */
public class CarFactory {
    public  Car getCarName(String carName){
        if (null == carName){
            return null;
        }
        if ("Audi".equals(carName)){
            return new Audi();
        }else if ("Benz".equals(carName)){
            return new Benz();
        }else if ("BMW".equals(carName)){
            return new BMW();
        }else {
            return null;
        }
    }
}
