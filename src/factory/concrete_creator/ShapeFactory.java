package factory.concrete_creator;

import factory.strict_factory.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        return null;
    }
}
