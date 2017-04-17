import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AttackTest {

    private Attack attack;
    private Character opponent;

    @Before
    public void setUp() {
        attack = new Attack();
        opponent = new Character();
    }

    @Test
    public void ifCombatantsDieRollEqualsOrExceedsOpponentsCombatantCanAttack() {
        opponent.setArmorClass(10);
        int opponentArmorClass = opponent.getArmorClass();
        boolean canAttack = attack.combatantCanAttack(10, opponentArmorClass);
        assertTrue(canAttack);
    }


}