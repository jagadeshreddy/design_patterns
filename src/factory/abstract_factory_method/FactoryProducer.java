package factory.abstract_factory_method;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("SHAPE"))
            return new ShapeFactory();
        else if(type.equalsIgnoreCase("COLOUR"))
            return new ColourFactory();
        return null;
    }
}
