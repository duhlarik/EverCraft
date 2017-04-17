import java.util.HashMap;
import java.util.Map;

public class AbilityModifier {

    public Map<Integer, Integer> abilityModifier = new HashMap<Integer, Integer>() {

        {
            put(1, -5);
            put(2, -4);
            put(3, -4);
            put(4, -3);
            put(5, -3);
            put(6, -2);
            put(7, -2);
            put(8, -1);
            put(9, -1);
            put(10, 0);
            put(11, 0);
            put(12, 1);
            put(13, 1);
            put(14, 2);
            put(15, 2);
            put(16, 3);
            put(17, 3);
            put(18, 4);
            put(19, 4);
            put(20, 5);
        }
    };

    public Map<Integer, Integer> getAbilityModifier() {
        return abilityModifier;
    }

    public int getModifier(Integer integer) {
        return abilityModifier.get(integer);
    }
}
