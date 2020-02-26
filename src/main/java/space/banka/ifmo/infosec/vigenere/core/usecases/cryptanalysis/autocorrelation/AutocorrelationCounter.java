package space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.autocorrelation;

public class AutocorrelationCounter {

    /**
     * Computes the autocorrelation coefficient for the specified string
     * with the specified period.
     *
     * <p>The <em>autocorrelation coefficient</em> is a probability that
     * the character <code>string[i]</code> at a random index <code>i</code>
     * (where <code>i < string.length() - period</code>) is the same
     * as the character <code>string[i + period]</code>.
     *
     * @param string the {@link CharSequence} for which an autocorrelation should be calculated.
     * @param period the distance at which matching characters count as correlating.
     * @return the autocorrelation coefficient for the specified string and period.
     */
    public double computeAutocorrelation(CharSequence string, int period) {
        throw new UnsupportedOperationException("Not implemented"); // TODO
    }
}
