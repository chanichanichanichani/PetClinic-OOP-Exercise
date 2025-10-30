package petclinic_system;

import java.util.ArrayList;
import java.util.List;

/**
 * המחלקה הראשית (Main Class) המדגימה את פעולת המערכת.
 * מכיל את שיטת main ואת מקרה המבחן (Test Case) להדגמת OOP.
 */
public class PetClinic {

    public static void main
    (String[] args) {
        System.out.println("🩺 *** מערכת ניהול מרפאת חיות מחמד *** 🐾\n");

        // 1. יצירת רשימה פולימורפית של חיות מחמד (List<Pet>)
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("בארט", 4, "לברדור"));
        pets.add(new Cat("לונה", 7, "שחור"));
        pets.add(new Dog("קיקי", 1, "צ'יוואווה"));
        System.out.println("יצירת חיות מחמד:\n-----------------");
        
        for (Pet pet : pets) {
            // הדגמת קישור דינמי: makeSound() ו-eat() נקראים בהתאם לטיפוס האמיתי (Dog/Cat)
            System.out.printf("  - %s (%s, גיל %d) | קול: %s | אוכל: %s\n", 
                                pet.getName(), pet.getSpecies(), pet.getAge(), pet.makeSound(), pet.eat());
        }

        System.out.println("\n-----------------------------------------------\n");

        // 2. יצירת וטרינרים (מימוש הממשק Veterinarian)
        Veterinarian generalVet = new GeneralVeterinarian("מאיה כהן");
        Veterinarian specialistVet = new SpecialistVeterinarian("דניאל לוי", "אורתופדיה");
        
        System.out.printf("הוטרינרים שלנו: ד\"ר %s (כללי) וד\"ר %s (מומחה ל%s)\n\n", 
                          generalVet.getName(), specialistVet.getName(), ((SpecialistVeterinarian)specialistVet).specialty);


        // 3. הדגמת תהליך הבדיקה (פולימורפיזם)
        System.out.println("*** תהליך הבדיקה הוטרינרית: ***");
        
        for (Pet pet : pets) {
            System.out.println("==================================================");
            
            // שימוש בשיטה examinePet שמומשה באופן שונה על ידי כל וטרינר
            System.out.println(generalVet.examinePet(pet));
            System.out.println(specialistVet.examinePet(pet));
        }

        System.out.println("==================================================");
        System.out.println("\n✅ סיום הדגמת המערכת בהצלחה.");
    }
}