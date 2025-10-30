package petclinic_system;

/**
 * וטרינר כללי המממש (implements) את ממשק Veterinarian.
 */
public class GeneralVeterinarian implements Veterinarian {
    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    
    @Override
    public String examinePet(Pet pet) {
        String exam = String.format("--- בדיקה כללית על ידי ד\"ר %s ---\n", name);
        exam += String.format("  * חיית מחמד: %s (%s, בן %d)\n", pet.getName(), pet.getSpecies(), pet.getAge());
        exam += String.format("  * המלצה: בדיקת דופק, חום, וניקיון כללי. בריא בסך הכל.\n");
        return exam;
    }
}