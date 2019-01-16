package com.macdonald.euler;

import java.util.List;
import java.util.function.LongPredicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class PrimeFactorGenerator
{

    private Long numberUnderTest;

    private LongPredicate isPrime = x -> true;
    private LongStream primes = LongStream
            .iterate(2, i -> i + 1)
            .filter(i -> isPrime.test(i))
            .peek(i -> isPrime = isPrime.and(v -> v % i != 0));

    PrimeFactorGenerator(Long numberUnderTest)
    {
        this.numberUnderTest = numberUnderTest;
    }

    List<Long> listPrimeFactors()
    {
        return primes.limit(7000)
                .filter(number -> numberUnderTest % number == 0)
                .boxed()
                .collect(Collectors.toList());

    }

    void highestFactor()
    {
        LongStream.rangeClosed(1, numberUnderTest)
                .filter(e -> numberUnderTest % e == 0)
                .forEach(System.out::println);
    }

}
