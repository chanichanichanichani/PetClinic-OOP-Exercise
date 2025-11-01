package petclinic_system;

import java.util.ArrayList;
import java.util.List;


public class PetClinic {

    public static void main3
    
    (String[] args) {
        System.out.println(" *** מערכת ניהול מרפאת חיות מחמד *** 🐾\n");

        // 1. יצירת חיות מחמד
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("בארט", 4, "לברדור"));
        pets.add(new Cat("לונה", 7, "שחור"));
        pets.add(new Dog("קיקי", 1, "צ'יוואווה"));
        System.out.println("יצירת חיות מחמד:\n-----------------");
        
        for (Pet pet : pets) {
            
            System.out.printf("  - %s (%s, גיל %d) | קול: %s | אוכל: %s\n", 
                                pet.getName(), pet.getSpecies(), pet.getAge(), pet.makeSound(), pet.eat());
        }

        System.out.println("\n-----------------------------------------------\n");

        // 2. יצירת וטרינרים
        Veterinarian generalVet = new GeneralVeterinarian("מאיה כהן");
        Veterinarian specialistVet = new SpecialistVeterinarian("דניאל לוי", "אורתופדיה");
        
        System.out.printf("הוטרינרים שלנו: ד\"ר %s (כללי) וד\"ר %s (מומחה ל%s)\n\n", 
                          generalVet.getName(), specialistVet.getName(), ((SpecialistVeterinarian)specialistVet).getSpecialty());


        // 3. 
        System.out.println("*** תהליך הבדיקה הוטרינרית: ***");
        
        for (Pet pet : pets) {
            System.out.println("==================================================");
            
            
            System.out.println(generalVet.examinePet(pet));
            System.out.println(specialistVet.examinePet(pet));
        }

    }
}