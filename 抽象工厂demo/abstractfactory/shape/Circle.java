package abstractfactory.shape;

/**
 * Created by liushihan on 2019/1/21.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.printf("Circle");
    }
}
