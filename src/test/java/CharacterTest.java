import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CharacterTest {

    Character character;
    Character opponent;
    Attack attack;

    @Before
    public void setUp() {
        character = new Character();
        opponent = new Character();
        attack = new Attack();
    }

    @Test
    public void characterCanSetAndGetName() {
        character.setName("Sabotage");
        assertEquals("Sabotage", character.getName());
    }

    @Test
    public void characterCanSetAndGetAlignment() {
        character.setAlignment("Good");
        assertEquals("Good", character.getAlignment());
    }

    @Test
    public void characterHasAnArmorClassThatDefaultsTo10() {
        assertEquals(10, character.getArmorClass());
    }

    @Test
    public void characterHasHitPointsThatDefaultTo5() {
        assertEquals(5, character.getHitPoints());
    }

    @Test
    public void ifCombatantCanAttackOpponentTakesOnePointOfDamage() {
        opponent.setArmorClass(10);
        int opponentsArmorClass = opponent.getArmorClass();
        opponent.setHitPoints(5);
        int hitPoints = opponent.getHitPoints();
        if (attack.combatantCanAttack(10, opponentsArmorClass)) {
            hitPoints = opponent.isDamaged(1);
        }

        assertEquals(4, hitPoints);
    }

    @Test
    public void ifCombatantRollsANatural20OpponentTakesTwoPointsOfDamage() {
        opponent.setArmorClass(10);
        int opponentsArmorClass = opponent.getArmorClass();
        opponent.setHitPoints(9);
        int hitPoints = opponent.getHitPoints();
        if (attack.combatantCanAttack(10, opponentsArmorClass)) {
            hitPoints = opponent.isDamaged(2);
        }

        assertEquals(7, hitPoints);
    }

    @Test
    public void ifCharactersHitPointsAreZeroOrLessCharacterIsDead() {
        character.setHitPoints(0);
        boolean alive = character.isAlive();

        assertFalse(alive);
    }

}