package factory.strict_factory;

public class CircleFactory extends AbstractShapeFactory{

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
