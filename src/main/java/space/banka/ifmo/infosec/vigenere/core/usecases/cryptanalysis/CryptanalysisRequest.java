package space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis;

import space.banka.ifmo.infosec.vigenere.core.entities.Alphabet;

import java.util.Map;

public class CryptanalysisRequest {

    private String ciphertext;
    private Alphabet alphabet;
    private Map<Character, Float> frequencies;
}
