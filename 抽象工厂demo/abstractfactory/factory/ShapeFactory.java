package abstractfactory.factory;

import abstractfactory.AbstractFactory;
import abstractfactory.color.Color;
import abstractfactory.shape.Circle;
import abstractfactory.shape.Rectangle;
import abstractfactory.shape.Shape;
import abstractfactory.shape.Square;

import javax.swing.*;

/**
 * Created by liushihan on 2019/1/21.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColorFactory(String color) {
        return null;
    }

    @Override
    public Shape getShapeFactory(String shape) {
        if (shape == null) return null;
        if (shape.equalsIgnoreCase("circle"))
            return new Circle();
        if (shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        if (shape.equalsIgnoreCase("square"))
            return new Square();
        return null;
    }
}
