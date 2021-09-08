package factory.example;

public class AnimalFactory extends AnimalFactoryInterface{
    @Override
    public Animal getAnimal(String type) throws Exception {
        if(type.equalsIgnoreCase("DUCK"))
            return new Duck();
        else if(type.equalsIgnoreCase("TIGER"))
            return new Tiger();
        throw  new Exception("Invalid type");
    }
}
