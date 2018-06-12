package factory;

/**
 * Created by liushihan on 2018/6/11.
 */
public class BuyCar {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car newAudi = carFactory.getCarName("Audi");
        newAudi.makeCar();

        Car newBenz = carFactory.getCarName("Benz");
        newBenz.makeCar();

        Car newBMW = carFactory.getCarName("BMW");
        newBMW.makeCar();
    }
}
