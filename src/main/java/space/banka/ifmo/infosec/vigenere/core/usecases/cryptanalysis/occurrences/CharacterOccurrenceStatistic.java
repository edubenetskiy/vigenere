package space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.occurrences;

import java.util.Map;

public class CharacterOccurrenceStatistic {

    private final CharSequence original;
    private final Map<Integer, Integer> characterOccurences;

    public CharacterOccurrenceStatistic(CharSequence original, Map<Integer, Integer> characterOccurrences) {
        this.original = original;
        this.characterOccurences = characterOccurrences;
    }

    public CharSequence getOriginal() {
        return original;
    }

    public int getOccurrencesOf(int character) {
        return characterOccurences.getOrDefault(character, 0);
    }

    public int getTotalOccurrences() {
        return original.length();
    }

    public double getFrequencyOf(int character) {
        return (double) getOccurrencesOf(character) / getTotalOccurrences();
    }

    @Override
    public String toString() {
        return "CharacterOccurrenceStatistic{" +
               "original=" + original +
               ", characterOccurences=" + characterOccurences +
               '}';
    }
}
