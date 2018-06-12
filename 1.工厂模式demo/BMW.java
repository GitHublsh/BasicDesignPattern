package factory;

/**
 * Created by liushihan on 2018/6/11.
 */
public class BMW implements Car {
    @Override
    public void makeCar() {
        System.out.println("Create BMW");
    }
}
