package petclinic_system;

/**
 * מחלקה יורשת (extends) מ-Pet המייצגת כלב.
 * מדגימה Method Overriding.
 */
public class Dog extends Pet {
    private String breed;

    // קונסטרוקטור
    public Dog(String name, int age, String breed) {
        super(name, age, "כלב");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    // דריסת השיטה (Overriding)
    @Override
    public String makeSound() {
        return "נובח: ווף ווף!";
    }

    // דריסת השיטה (Overriding)
    @Override
    public String eat() {
        return "אוכל מזון כלבים איכותי.";
    }
}