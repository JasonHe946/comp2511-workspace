package random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    
    @Test 
    public void testPosFourSeed() {
        // 62 52 3 58 67 5 11 46
        Game game = new Game(4);
        assertEquals(game.battle(), true);
        assertEquals(game.battle(), true);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), true);
        assertEquals(game.battle(), true);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), false);
    }

    @Test 
    public void testNegFourSeed() {
        // 39 13 98 5 43 89 20 23
        Game game = new Game(-4);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), true);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), true);
        assertEquals(game.battle(), false);
        assertEquals(game.battle(), false);
    }

}