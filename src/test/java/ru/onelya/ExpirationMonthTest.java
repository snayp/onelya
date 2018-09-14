package ru.onelya;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

/**
 * Created by user6 on 14.09.2018.
 */
public class ExpirationMonthTest {

    Integer expmonth = 11;

    @Test
    public void expirationMonthIsInt() {
        assertThat("expiration_month цифра", expmonth, isA(Integer.class));
    }

    @Test
    public void expirationMonthIsLessThanOrEqualTo4() {
        assertThat("expiration_month не больше 12", expmonth, lessThanOrEqualTo(12));
    }

    @Test
    public void expirationMonthIsGreaterThanOrEqualTo3() {
        assertThat("expiration_month не меньше 1", expmonth, greaterThanOrEqualTo(1));
    }
}
