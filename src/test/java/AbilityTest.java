import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbilityTest {

    Character character;
    Character opponent;
    Ability ability;
    Attack attack;

    @Before
    public void setUp() {
        character = new Character();
        opponent = new Character();
        ability = new Ability();
        attack = new Attack();
    }

    @Test
    public void charactersHaveAbilitiesWithADefaultValueOf10() {

        assertEquals(10, ability.getAbility("Strength"));
    }

    @Test
    public void modifierForStrengthIsAddedToAttackRoll() {
        opponent.setArmorClass(10);
        character.updateAbilities("Strength", 12);
        boolean canIAttack = attack.combatantCanAttack(character.rollOfDie(9), opponent.getArmorClass());

        assertEquals(true, canIAttack);
    }

}