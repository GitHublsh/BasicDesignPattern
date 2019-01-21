package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

/**
 * Created by liushihan on 2019/1/21.
 */
public abstract class AbstractFactory {
    public abstract Color getColorFactory(String color);
    public abstract Shape getShapeFactory(String shape);
}
