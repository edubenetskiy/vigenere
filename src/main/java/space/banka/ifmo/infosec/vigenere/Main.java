package space.banka.ifmo.infosec.vigenere;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ReaderInputStream;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.io.output.WriterOutputStream;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;

public class Main {

    public static final String ENV_VAR_NAME_FOR_KEYPHRASE = "VIGENERE_KEY";

    public static void main(String[] args) throws IOException {

        String keyphrase = System.getenv(ENV_VAR_NAME_FOR_KEYPHRASE);
        if (keyphrase == null) {
            throw new IllegalArgumentException("Please specify encryption key as environment variable " + ENV_VAR_NAME_FOR_KEYPHRASE);
        }

        Alphabet alphabet = FixedAlphabet.fromString("ABC\n");
        VigenereTable vigenereTable = new VigenereTable(alphabet);

        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        WriterOutputStream outputStream = new WriterOutputStream(stringBuilderWriter, Charset.defaultCharset());

        VigenereEncryptionOutputStream encryptor = new VigenereEncryptionOutputStream(keyphrase, vigenereTable, outputStream);

        int numReadBytes = IOUtils.copy(System.in, encryptor);
        outputStream.flush();
        stringBuilderWriter.flush();
        System.err.println("Read " + numReadBytes + " bytes from STDIN");

        System.err.println("Encrypted: <<EOF\n" + stringBuilderWriter.toString() + "\nEOF");

        StringReader stringReader = new StringReader(stringBuilderWriter.toString());
        ReaderInputStream inputStream = new ReaderInputStream(stringReader, Charset.defaultCharset());
        VigenereDecryptionInputStream decrypted = new VigenereDecryptionInputStream(keyphrase, vigenereTable, inputStream);

        IOUtils.copy(decrypted, System.err);
    }
}
