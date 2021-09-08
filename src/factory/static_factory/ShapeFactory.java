package factory.static_factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        return null;
    }
}
