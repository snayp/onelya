package ru.onelya;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

/**
 * Created by user6 on 14.09.2018.
 */
public class AmounTest {
    double amount = 155553.65;

    @Test
    public void amountIsDouble() {
        assertThat("amount число с плавающей точкой", amount, isA(Double.class));
    }

    @Test
    public void amountIsLessThan999999_99() {
        assertThat("amount число меньше либо равное 999999.99", amount, lessThanOrEqualTo(999999.99));
    }
}
