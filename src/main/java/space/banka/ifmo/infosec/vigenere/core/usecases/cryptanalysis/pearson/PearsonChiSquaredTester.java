package space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.pearson;

import space.banka.ifmo.infosec.vigenere.core.usecases.cryptanalysis.occurrences.FrequencyDistribution;

public class PearsonChiSquaredTester {

    /**
     * Calculates the value of the Pearson's chi-squared statistic
     * for the two specified distributions.
     *
     * @param actualDistribution      the actual observed distribution of elements' frequencies.
     * @param theoreticalDistribution the expected theoretical distribution of elements' frequencies.
     * @return the value of the chi-squared test statistic for the given distributions.
     */
    public double computeChiSquaredStatistic(FrequencyDistribution<?> actualDistribution,
                                             FrequencyDistribution<?> theoreticalDistribution) {

        throw new UnsupportedOperationException("Not implemented"); // TODO
    }
}
