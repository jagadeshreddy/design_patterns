package factory.abstract_factory_method;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if(type.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(type.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        return null;
    }

    @Override
    public Colour getColour(String type) {
        return null;
    }
}
