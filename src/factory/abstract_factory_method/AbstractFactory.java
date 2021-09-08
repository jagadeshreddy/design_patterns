package factory.abstract_factory_method;

public abstract class AbstractFactory {
     public abstract Shape getShape(String type);
    public abstract Colour getColour(String type);
}
