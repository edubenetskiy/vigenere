package space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.coincidence;

import space.banka.ifmo.infosec.vigenere.core.entities.Alphabet;
import space.banka.ifmo.infosec.vigenere.core.entities.Alphabets;
import space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.occurrences.CharacterOccurrenceCounter;
import space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.occurrences.CharacterOccurrenceStatistic;

public class CoincidenceCounter {

    /**
     * Calculates the index of coincidence for the specified string.
     *
     * <p>The <em>index of coincidence</em>, or IC for short, is a probability
     * of drawing two matching letters by randomly selecting two characters
     * from a given text.
     *
     * @param string the string for which the IC is computed.
     * @return the IC for the given string.
     */
    public double countIndexOfCoincidence(CharSequence string) {
        double freqsSum = 0.0;
        double indexOfCoincidence = 0.0;
        int N = 0;
        Alphabet alphabet = Alphabets.lowerCaseLatin();
        string.toString().toLowerCase();
        CharacterOccurrenceStatistic freqs = new CharacterOccurrenceCounter().countOccurrences(string);


        for(int i=0; i<string.length(); i++){
            int character = string.charAt(i);
            if(character>=(int) 'a' && character <= (int) 'z'){
                N++;
            }
        }

        for (int i = (int) 'a'; i<=(int) 'z'; i++) {
            freqsSum += freqs.getOccurrencesOf(i) * (freqs.getOccurrencesOf(i) - 1);
        }

        indexOfCoincidence = freqsSum / (N*(N-1));

        return indexOfCoincidence;
    }
}
