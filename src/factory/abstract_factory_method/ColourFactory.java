package factory.abstract_factory_method;

public class ColourFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Colour getColour(String type) {
        if(type.equalsIgnoreCase("BLUE"))
            return new Blue();
        else if(type.equalsIgnoreCase("RED"))
            return new Red();
        return null;
    }
}
