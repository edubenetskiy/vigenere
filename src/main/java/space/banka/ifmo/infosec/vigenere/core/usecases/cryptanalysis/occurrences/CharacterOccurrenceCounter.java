package space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.occurrences;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CharacterOccurrenceCounter {

    public CharacterOccurrenceStatistic countOccurrences(CharSequence charSequence) {
        Map<Integer, Integer> characterOccurrences = new ConcurrentHashMap<>();
        charSequence.chars()
                .parallel()
                .forEach(character -> characterOccurrences.merge(character, 1, Integer::sum));
        return new CharacterOccurrenceStatistic(charSequence, characterOccurrences);
    }
}
