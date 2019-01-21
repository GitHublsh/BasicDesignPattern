package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.factory.FactoryProducer;
import abstractfactory.shape.Shape;
import sun.applet.Main;

/**
 * Created by liushihan on 2019/1/21.
 */
public class Paint {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape = shapeFactory.getShapeFactory("circle");
        shape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color color = colorFactory.getColorFactory("Blue");
        color.fill();
    }
}
