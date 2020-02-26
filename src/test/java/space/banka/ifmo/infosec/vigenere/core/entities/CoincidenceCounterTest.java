package space.banka.ifmo.infosec.vigenere.core.entities;

import org.junit.jupiter.api.Test;
import space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.coincidence.CoincidenceCounter;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoincidenceCounterTest {

    @Test
    void isIndexRightTest(){
        CoincidenceCounter counter = new CoincidenceCounter();

        String toAnalyse = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        double rightIndex = 0.06887;
        double calcIndex = counter.countIndexOfCoincidence(toAnalyse);
        assertEquals(rightIndex, calcIndex, 0.0001 );
    }
}
