package petclinic_system;

/**
 * מחלקה אבסטרקטית (Abstract Class) Pet - הבסיס לכל חיות המחמד.
 * מגדירה תכונות משותפות (name, age, species) ומכריחה יורשים לממש התנהגויות (makeSound, eat).
 */
public abstract class Pet {
    // תכונות פרטיות (private) - מודל ה-Encapsulation
    private String name;
    private int age;
    
    // תכונה מוגנת (protected) - נגישה רק למחלקות יורשות
    protected String species;

    // קונסטרוקטור
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // שיטות Getters ציבוריות
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // שיטות אבסטרקטיות (abstract) - חייבות להיות ממומשות
    public abstract String makeSound();

    public abstract String eat();
}