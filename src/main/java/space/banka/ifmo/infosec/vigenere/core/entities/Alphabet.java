package space.banka.ifmo.infosec.vigenere.core.entities;

import space.banka.ifmo.infosec.vigenere.core.exceptions.IllegalKeyCharacterException;

public abstract class Alphabet {

    private static final String LATIN_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String LATIN_UPPERCASE = LATIN_LOWERCASE.toUpperCase();

    public static Alphabet withChars(String alphabetChars) {
        return new FixedAlphabet(alphabetChars, FixedAlphabet.buildCharToAlphabetIndexMap(alphabetChars));
    }

    public static Alphabet lowerCaseLatin() {
        return Alphabet.withChars(LATIN_LOWERCASE);
    }

    public static Alphabet latin() {
        return Alphabet.withChars(LATIN_LOWERCASE + LATIN_UPPERCASE);
    }

    /**
     * Finds the index within the alphabet of the specified character.
     *
     * @param character character to find in the alphabet.
     * @return zero-based index of the character in the alphabet.
     * @throws IllegalKeyCharacterException if there is no such character in the alphabet.
     */
    abstract int indexOf(int character);

    /**
     * Returns the character located in the alphabet at the specified index.
     *
     * @param index zero-based index of a character in the alphabet.
     * @return the character at the given index.
     */
    abstract int charAt(int index);

    /**
     * Returns the number of characters in the alphabet.
     *
     * @return the alphabet's length.
     */
    abstract int length();
}
