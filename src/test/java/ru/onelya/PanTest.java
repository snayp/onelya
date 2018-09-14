package ru.onelya;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertTrue;

import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;

/**
 * Created by user6 on 14.09.2018.
 */
public class PanTest {

    Integer[] pan = {4, 5, 4, 5, 6, 7, 8, 9, 7, 6, 5, 5};

    @Test
    public void panIsAllInt() {
        for (int i = 0; i<pan.length; i++){
            assertThat("номер карты состоит только из цифр", pan[i], isA(Integer.class));
        }
    }

    @Test
    public void panIsLessThanOrEqualTo16() {
        assertThat("номер карты не больше 16 символов", pan.length, lessThanOrEqualTo(16));
    }

    @Test
    public void panIsGreaterThanOrEqualTo12() {
        assertThat("номер карты не меньше 12 символов", pan.length, greaterThanOrEqualTo(12));
    }

    @Test
    public void panIsLuhn() {
        boolean luhnIsTrue = LuhnCheckDigit.LUHN_CHECK_DIGIT.isValid(pan.toString());
        assertTrue("номер карты не прошел проверку на Luhn алгоритм", luhnIsTrue);
    }
}
