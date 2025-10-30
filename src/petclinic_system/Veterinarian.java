package petclinic_system;

/**
 * ממשק (Interface) המגדיר את החוזה (Contract) להתנהגות וטרינרית.
 */
public interface Veterinarian {
    
    String getName();

    String examinePet(Pet pet);
}