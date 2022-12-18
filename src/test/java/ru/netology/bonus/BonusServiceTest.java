package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void testBonusService(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();

        int actual = service.calcBonus(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }
}
