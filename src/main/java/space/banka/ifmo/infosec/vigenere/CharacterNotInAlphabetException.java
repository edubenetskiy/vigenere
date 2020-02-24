package space.banka.ifmo.infosec.vigenere;

import java.text.MessageFormat;

public class CharacterNotInAlphabetException extends RuntimeException {

    public CharacterNotInAlphabetException(int character, Alphabet alphabet) {
        super(MessageFormat.format("Invalid character {1} (byte {0}) does not belong to alphabet {2}",
                character, Character.getName(character), alphabet));
    }
}
