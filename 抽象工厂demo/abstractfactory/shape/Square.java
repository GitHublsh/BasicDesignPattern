package abstractfactory.shape;

/**
 * Created by liushihan on 2019/1/21.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.printf("Square");
    }
}
