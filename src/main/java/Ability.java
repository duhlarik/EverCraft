import java.util.HashMap;
import java.util.Map;

public class Ability {

    AbilityModifier abilityModifier = new AbilityModifier();

    public Map<String, Integer> abilities = new HashMap<String, Integer>() {
        {
            put("Strength", 10);
            put("Dexterity", 10);
            put("Constitution", 10);
            put("Wisdom", 10);
            put("Intelligence", 10);
            put("Charisma", 10);
        }
    };

    int getAbility(String ability) {
        return abilities.get(ability);
    }

    public void updateAbilities(String ability, Integer newValue) {
        abilities.replace(ability, newValue);
    }

    public int getAbilityModifier(Integer integer) {
        return abilityModifier.getModifier(integer);
    }
}
