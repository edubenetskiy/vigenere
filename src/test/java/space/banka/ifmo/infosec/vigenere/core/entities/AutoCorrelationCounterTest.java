package space.banka.ifmo.infosec.vigenere.core.entities;

import org.junit.jupiter.api.Test;
import space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.autocorrelation.AutocorrelationCounter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoCorrelationCounterTest {

    @Test
    void stringShiftTest() {
        AutocorrelationCounter counter = new AutocorrelationCounter();
        String input = "ILoveMarkina";
        int period = 4;
        String shitedString = counter.stringShift(input, period).toString();
        assertEquals("kinaILoveMar", shitedString);

    }

    @Test
    void removeNonLettersTest() {
        AutocorrelationCounter counter = new AutocorrelationCounter();
        String input = "!abc? fg, hj.7%k";
        String expected = "abcfghjk";
        assertEquals(expected, counter.removeAllNonLetters(input));
    }

    @Test
    void coefficientCountingTest() {
        AutocorrelationCounter counter = new AutocorrelationCounter();
        String input = "iloveinfobezlookatmeiamcool";
        double expected = 0.142857;
        assertEquals(expected, counter.computeAutocorrelation(input, 6), 0.0001);
    }
}
