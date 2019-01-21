package abstractfactory.shape;

/**
 * Created by liushihan on 2019/1/21.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.printf("Rectangle");
    }
}
