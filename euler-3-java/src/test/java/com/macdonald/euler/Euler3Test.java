package com.macdonald.euler;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

import static junit.framework.TestCase.assertTrue;

public class Euler3Test
{

    private static final long KNOWN_FACTORS_NUMBER = 13195;
    private static final long NUMBER_UNDER_TEST = 600851475143L;

    private static final List<Long> PRIME_FACTORS_OF_KNOWN_NUMBER = Arrays.asList(5L, 7L, 13L, 29L);

    @Test
    public void primeFactorGenerator_withKnownNumberUnderTest_returnsFactors()
    {
        PrimeFactorGenerator primeFactorGenerator = new PrimeFactorGenerator(KNOWN_FACTORS_NUMBER);
        Assert.assertEquals(PRIME_FACTORS_OF_KNOWN_NUMBER, primeFactorGenerator.listPrimeFactors());
    }


    @Test
    public void primeFactorGenerator_withKnownNumberUnderTest_returnsPrimeFactors()
    {
        PrimeFactorGenerator primeFactorGenerator = new PrimeFactorGenerator(KNOWN_FACTORS_NUMBER);
        List<Long> primeFactors = primeFactorGenerator.listPrimeFactors();
        for (Long primeFactor : primeFactors)
        {
            assertTrue(isAPrime(primeFactor));
        }
        System.out.println(primeFactors);

    }


    @Test
    public void primeFactorGenerator_withNumberUnderTest_returnsPrimeFactors()
    {
        PrimeFactorGenerator primeFactorGenerator = new PrimeFactorGenerator(NUMBER_UNDER_TEST);
        List<Long> primeFactors = primeFactorGenerator.listPrimeFactors();
        for (Long primeFactor : primeFactors)
        {
            assertTrue(isAPrime(primeFactor));
        }
        System.out.println(primeFactors);
    }


    private boolean isAPrime(long number)
    {
        return LongStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

}
