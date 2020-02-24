package space.banka.ifmo.infosec.vigenere;

import java.util.HashMap;

public class FixedAlphabet implements Alphabet {

    private final String chars;
    private final HashMap<Integer, Integer> charToIndex;

    public FixedAlphabet(String chars, HashMap<Integer, Integer> charToIndex) {
        this.chars = chars;
        this.charToIndex = charToIndex;
    }

    static Alphabet fromString(String alphabetChars) {
        return new FixedAlphabet(alphabetChars, buildAlphabetToIndexMap(alphabetChars));
    }

    private static HashMap<Integer, Integer> buildAlphabetToIndexMap(CharSequence alphabet) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int alphabetIndex = 0; alphabetIndex < alphabet.length(); alphabetIndex++) {
            int alphabetChar = alphabet.charAt(alphabetIndex);
            map.put(alphabetChar, alphabetIndex);
        }
        return map;
    }

    @Override
    public int indexOf(int character) {
        Integer index = charToIndex.get(character);
        if (index == null) {
            throw new CharacterNotInAlphabetException(character, this);
        }
        return index;
    }

    @Override
    public int charAt(int index) {
        return chars.charAt(index);
    }

    @Override
    public int length() {
        return chars.length();
    }
}
