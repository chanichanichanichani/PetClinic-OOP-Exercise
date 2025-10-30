package petclinic_system;


public class Dog extends Pet {
    private String breed;

    
    public Dog(String name, int age, String breed) {
        super(name, age, "כלב");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    
    @Override
    public String makeSound() {
        return "נובח: ווף ווף!";
    }

    
    @Override
    public String eat() {
        return "אוכל כלבים .";
    }
}