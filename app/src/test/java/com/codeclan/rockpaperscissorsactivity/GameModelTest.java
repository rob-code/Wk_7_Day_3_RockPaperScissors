package com.codeclan.rockpaperscissorsactivity;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class GameModelTest {

    GameModel gameModel;

    @Before
    public void before() {
        gameModel = new GameModel( Hand.ROCK.toString() );
    }

    @Test
    public void hasHand(){
//        String expected = Hand.ROCK.toString();
        assertEquals( "Rock", gameModel.getPlayerHand() );
    }

    @Test
    public void hasRandomHandFromModel(){
        assertEquals("Rock", gameModel.getRandomHand());
    }

    @Test
    public void testWhoWonTheGame(){;
        String result = gameModel.whoWon();
        System.out.println(result);

    }
}