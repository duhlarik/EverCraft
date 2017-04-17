
public class Character {

    String name;
    String alignment;
    int armorClass = 10;
    int hitPoints = 5;
    Ability abilities = new Ability();

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAlignment() {
        return alignment;
    }

    void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    int getArmorClass() {
        return armorClass;
    }

    void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    int getHitPoints() {
        return hitPoints;
    }

    void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    int isDamaged(int damagePoints) {
        hitPoints = getHitPoints() - damagePoints;
        setHitPoints(hitPoints);
        return getHitPoints();
    }

    boolean isAlive() {
        return getHitPoints() > 0;
    }

    void updateAbilities(String specificAbility, Integer newValue) {
        abilities.updateAbilities(specificAbility, newValue);
    }

    int rollOfDie(int diceRoll) {
        int abilityScore = abilities.getAbility("Strength");
        if(abilityScore > 11) {
            return diceRoll + abilities.getAbilityModifier(abilityScore);
        } else return diceRoll;
    }
}
