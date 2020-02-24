package space.banka.ifmo.infosec.vigenere;

public interface Alphabet {

    /**
     * Finds the index at which the character is located in the alphabet.
     *
     * @param character character to find in the alphabet
     * @return zero-based index of the character in the alphabet
     * @throws CharacterNotInAlphabetException if character is not found in alphabet
     */
    int indexOf(int character);

    /**
     * Returns the character located in the alphabet at the given index.
     *
     * @param index zero-based index of a character in the alphabet
     * @return the character at the given index
     */
    int charAt(int index);

    /**
     * Returns the number of characters in the alphabet.
     *
     * @return the alphabet's length.
     */
    int length();
}
