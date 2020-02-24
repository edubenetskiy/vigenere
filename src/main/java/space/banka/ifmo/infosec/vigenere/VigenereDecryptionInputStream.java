package space.banka.ifmo.infosec.vigenere;

import java.io.IOException;
import java.io.InputStream;

public class VigenereDecryptionInputStream extends InputStream {

    private final InputStream inner;
    private final VigenereTable vigenereTable;
    private final String key;

    private int keyIndex;

    public VigenereDecryptionInputStream(String key, VigenereTable vigenereTable, InputStream inner) {
        this.key = key;
        this.keyIndex = 0;
        this.vigenereTable = vigenereTable;
        this.inner = inner;
    }

    @Override
    public int read() throws IOException {
        keyIndex = (keyIndex + 1) % key.length();
        int keyChar = key.charAt(keyIndex);
        int encryptedCharacter = inner.read();
        if (encryptedCharacter == -1) {
            return -1;
        }
        return vigenereTable.decode(encryptedCharacter, keyChar);
    }
}
