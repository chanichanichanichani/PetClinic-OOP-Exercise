package petclinic_system;

/**
 * ממשק (Interface) המגדיר את החוזה (Contract) להתנהגות וטרינרית.
 */
public interface Veterinarian {
    // שיטות הן ציבוריות (public) ואבסטרקטיות (abstract) כברירת מחדל
    String getName();

    /**
     * שיטה פולימורפית (Polymorphic) המקבלת אובייקט Pet.
     */
    String examinePet(Pet pet);
}