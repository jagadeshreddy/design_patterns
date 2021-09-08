package factory.abstract_factory_method;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle : draw() ");
    }
}
