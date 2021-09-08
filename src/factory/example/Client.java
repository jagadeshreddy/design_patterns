package factory.example;

public class Client {
    public static void main(String[] args) throws Exception {
        AnimalFactoryInterface animalFactory  = new AnimalFactory();
        Animal duck = animalFactory.getAnimal("DUCK");
        duck.speak();
        Animal tiger = animalFactory.getAnimal("TIGER");
        tiger.speak();
    }
}
