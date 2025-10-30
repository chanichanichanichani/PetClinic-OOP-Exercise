package petclinic_system;


public class Cat extends Pet {
    private String color;

    
    public Cat(String name, int age, String color) {
        super(name, age, "חתול");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    
    @Override
    public String makeSound() {
        return "מיילל: מיאו!";
    }

    
    @Override
    public String eat() {
        return "אוכל מזון חתולים (טונה).";
    }
}