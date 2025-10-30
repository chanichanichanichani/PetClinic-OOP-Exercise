package petclinic_system;

/**
 * וטרינר מומחה המממש את ממשק Veterinarian.
 * מדגים שימוש בתכונה נוספת (specialty) במימוש הממשק.
 */
public class SpecialistVeterinarian implements Veterinarian {
    private String name;
    public String specialty; // שיניתי ל-public רק לנוחות הדפסה ב-main

    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return name;
    }

    // מימוש השיטה examinePet (עם התמחות)
    @Override
    public String examinePet(Pet pet) {
        String exam = String.format("--- בדיקה מומחית על ידי ד\"ר %s (מומחה ל-%s) ---\n", name, specialty);
        exam += String.format("  * חיית מחמד: %s (%s)\n", pet.getName(), pet.getSpecies());
        
        // הדגמת פולימורפיזם ו-instanceof כדי להתייחס לנתונים ספציפיים
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            exam += String.format("  * התמקדות: בדיקת מפרקים ואורתופדיה עקב גזע %s.\n", dog.getBreed());
        } else if (pet instanceof Cat) {
            exam += "  * התמקדות: בדיקת כליות ודרכי השתן, כנדרש בחתולים.\n";
        } else {
            exam += "  * התמקדות: בדיקת התמחות ספציפית.\n";
        }
        return exam;
    }
}