package abstractfactory.factory;

import abstractfactory.AbstractFactory;
import abstractfactory.color.Blue;
import abstractfactory.color.Color;
import abstractfactory.color.Green;
import abstractfactory.color.Red;
import abstractfactory.shape.Shape;

/**
 * Created by liushihan on 2019/1/21.
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColorFactory(String color) {

        if (color == null) return null;
        if (color.equalsIgnoreCase("red"))
            return new Red();
        if (color.equalsIgnoreCase("green"))
            return new Green();
        if (color.equalsIgnoreCase("Blue"))
            return new Blue();
        return null;
    }

    @Override
    public Shape getShapeFactory(String shape) {
        return null;
    }
}
