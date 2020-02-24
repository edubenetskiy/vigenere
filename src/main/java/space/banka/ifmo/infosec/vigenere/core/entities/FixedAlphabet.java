package space.banka.ifmo.infosec.vigenere.core.entities;

import java.util.HashMap;

public class FixedAlphabet extends Alphabet {

    public static final int NOT_FOUND = -1;

    private final String chars;
    private final HashMap<Integer, Integer> charToIndex;

    public FixedAlphabet(String chars, HashMap<Integer, Integer> charToIndex) {
        this.chars = chars;
        this.charToIndex = charToIndex;
    }

    static HashMap<Integer, Integer> buildCharToAlphabetIndexMap(CharSequence alphabet) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int alphabetIndex = 0; alphabetIndex < alphabet.length(); alphabetIndex++) {
            int alphabetChar = alphabet.charAt(alphabetIndex);
            map.put(alphabetChar, alphabetIndex);
        }
        return map;
    }

    @Override
    public int indexOf(int character) {
        return charToIndex.getOrDefault(character, NOT_FOUND);
    }

    @Override
    public int charAt(int index) {
        return chars.charAt(index);
    }

    @Override
    public int length() {
        return chars.length();
    }

    @Override
    public String toString() {
        return "FixedAlphabet{" +
               "chars='" + chars + '\'' +
               '}';
    }
}
