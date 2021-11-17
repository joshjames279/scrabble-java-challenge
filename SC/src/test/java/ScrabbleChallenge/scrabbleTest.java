package ScrabbleChallenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class scrabbleTest {

    @Test
    public void returns0forEmptyWords(){
        Scrabble scrabble = new Scrabble("");

        assertEquals(scrabble.score(),0);
    }

    @Test
    public void returns0forWhiteSpace(){
        Scrabble scrabble = new Scrabble(" \t\n");

        assertEquals(scrabble.score(),0);
    }

    @Test
    public void returns0forNull(){
        Scrabble scrabble = new Scrabble(null);

        assertEquals(scrabble.score(),0);
    }

    @Test
    public void scoreForA(){
        Scrabble scrabble = new Scrabble("a");

        assertEquals(scrabble.score(),1);
    }

    @Test
    public void scoreForStreet(){
        Scrabble scrabble = new Scrabble("street");

        assertEquals(scrabble.score(),6);
    }

    @Test
    public void scoreForQuirky(){
        Scrabble scrabble = new Scrabble("quirky");

        assertEquals(scrabble.score(),22);
    }

    @Test
    public void scoreForUppercaseWord(){
        Scrabble scrabble = new Scrabble("OXYPHENBUTAZONE");

        assertEquals(scrabble.score(),41);
    }

}