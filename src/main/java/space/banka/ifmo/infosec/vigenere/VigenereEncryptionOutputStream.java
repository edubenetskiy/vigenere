package space.banka.ifmo.infosec.vigenere;

import java.io.IOException;
import java.io.OutputStream;

public class VigenereEncryptionOutputStream extends OutputStream {

    private final String key;
    private final VigenereTable vigenereTable;
    private final OutputStream inner;

    private int keyIndex;

    public VigenereEncryptionOutputStream(String key, VigenereTable vigenereTable, OutputStream inner) {
        this.key = key;
        this.vigenereTable = vigenereTable;
        this.inner = inner;
        this.keyIndex = 0;
    }

    @Override
    public void write(int character) throws IOException {
        keyIndex = (keyIndex + 1) % key.length();
        int keyChar = key.charAt(keyIndex);
        int encodedCharacter = vigenereTable.encode(character, keyChar);
        inner.write(encodedCharacter);
    }
}
