package space.banka.ifmo.infosec.vigenere.entrypoints.commands;

import space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.Cryptanalyzer;
import space.banka.ifmo.infosec.vigenere.entrypoints.Command;

public class CryptanalyzeCommand implements Command {

    private final Cryptanalyzer cryptanalyzer = new Cryptanalyzer();

    @Override
    public int run(String[] args) throws Exception {
        System.err.println("NOT IMPLEMENTED YET");
        return 1;
    }
}
