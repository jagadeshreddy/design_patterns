package factory.concrete_creator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle : draw()");
    }
}
