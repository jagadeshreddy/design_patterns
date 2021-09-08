package factory.static_factory;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
