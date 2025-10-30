package petclinic_system;

/**
 * מחלקה יורשת (extends) מ-Pet המייצגת חתול.
 * מדגימה Method Overriding.
 */
public class Cat extends Pet {
    private String color;

    // קונסטרוקטור
    public Cat(String name, int age, String color) {
        super(name, age, "חתול");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // דריסת השיטה (Overriding)
    @Override
    public String makeSound() {
        return "מיילל: מיאו!";
    }

    // דריסת השיטה (Overriding)
    @Override
    public String eat() {
        return "אוכל מזון חתולים (טונה).";
    }
}