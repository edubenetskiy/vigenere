package space.banka.ifmo.infosec.vigenere;

public class VigenereTable {

    private final Alphabet alphabet;

    public VigenereTable(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public int encode(int character, int keyCharacter) {
        int alphabetIndex = alphabet.indexOf(character);
        if (alphabetIndex < 0) {
            throw new CharacterNotInAlphabetException(character, alphabet);
        }

        int keyAlphabetIndex = alphabet.indexOf(keyCharacter);
        if (keyAlphabetIndex < 0) {
            throw new CharacterNotInAlphabetException(keyCharacter, alphabet);
        }

        int encryptedAlphabetIndex = Math.floorMod(alphabetIndex + keyAlphabetIndex, alphabet.length());
        return alphabet.charAt(encryptedAlphabetIndex);
    }

    public int decode(int character, int keyCharacter) {
        int alphabetIndex = alphabet.indexOf(character);
        if (alphabetIndex < 0) {
            throw new CharacterNotInAlphabetException(character, alphabet);
        }

        int keyAlphabetIndex = alphabet.indexOf(keyCharacter);
        if (keyAlphabetIndex < 0) {
            throw new CharacterNotInAlphabetException(keyCharacter, alphabet);
        }

        int decodedAlphabetIndex = Math.floorMod(alphabetIndex - keyAlphabetIndex, alphabet.length());
        return alphabet.charAt(decodedAlphabetIndex);
    }
}
