package factory.abstract_factory_method;

public class Red implements Colour{
    @Override
    public void fill() {
        System.out.println("Inside Red : fill() ");
    }
}
