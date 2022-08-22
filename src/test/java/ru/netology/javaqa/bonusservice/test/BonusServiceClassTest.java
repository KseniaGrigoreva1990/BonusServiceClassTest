
package ru.netology.javaqa.bonusservice.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.bonusservice.BonusServiceClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceClassTest {
    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/bonus.csv")
    public void shouldCalculateForRegisteredAndUnderLimit(long amount, boolean registered, long expected) {

        BonusServiceClass service = new BonusServiceClass();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    public void shouldCalculateForRegisteredAndOverLimit(long amount, boolean registered, long expected) {
        BonusServiceClass service = new BonusServiceClass();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    public void shouldCalculateForRegisteredAndZeroAmount(long amount, boolean registered, long expected) {
        BonusServiceClass service = new BonusServiceClass();

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    public void shouldCalculateForNotRegisteredAndOverLimit(long amount, boolean registered, long expected) {
        BonusServiceClass service = new BonusServiceClass();

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    public void shouldCalculateForNotRegisteredAndUnderLimit(long amount, boolean registered, long expected) {
        BonusServiceClass service = new BonusServiceClass();

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    public void shouldCalculateForNotRegisteredAndZeroAmount(long amount, boolean registered, long expected) {
        BonusServiceClass service = new BonusServiceClass();

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}