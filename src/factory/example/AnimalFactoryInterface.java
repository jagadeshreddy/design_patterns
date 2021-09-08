package factory.example;

public abstract class AnimalFactoryInterface {
    public abstract Animal getAnimal(String type) throws Exception;
}
