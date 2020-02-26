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
        double autocorrelationCoeddicient = 0.0;
        int matchCounter = 0;
        string.toString().toLowerCase();
        string = this.removeAllNonLetters(string);
        CharSequence shiftedString = this.stringShift(string, period);

        for (int i = 0; i < string.length(); i++) {
            int character1 = string.charAt(i);
            int character2 = shiftedString.charAt(i);
            if (character1 == character2) {
                matchCounter++;
            }
        }

        double divider = string.length() - period;
        autocorrelationCoeddicient = matchCounter / divider;

        return autocorrelationCoeddicient;
    }

    public CharSequence stringShift(CharSequence string, int period) {
        CharSequence shiftedString = string.subSequence(string.length() - period, string.length()).toString() + string.subSequence(0, string.length() - period).toString();
        return shiftedString;
    }

    public CharSequence removeAllNonLetters(CharSequence string) {
        String[] stringArray = string.toString().split("[^a-z]+");
        StringBuilder result = new StringBuilder();
        for (String s : stringArray) {
            result.append(s);
        }
        return result.toString();
    }
}
