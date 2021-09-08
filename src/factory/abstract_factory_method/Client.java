package factory.abstract_factory_method;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        AbstractFactory colourFactory = FactoryProducer.getFactory("COLOUR");
        Colour red = colourFactory.getColour("RED");
        red.fill();
    }
}
