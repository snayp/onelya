package ru.onelya;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by user6 on 14.09.2018.
 */
public class ExpirationYearTest {

    Integer[] expyear = {2, 0, 1, 9};
    String str = "";

    @Test
    public void expirationYearIsAllInt() {
        for (int i = 0; i<expyear.length; i++){
            assertThat("expiration_year состоит только из цифр", expyear[i], isA(Integer.class));
        }
    }

    @Test
    public void expirationYearIsExacrly4() {
        assertThat("expiration_year состоит из 4 символов", expyear, arrayWithSize(4));
    }

    @Test
    public void expirationYearIsStarts20() {
        for(int i=0; i<expyear.length; i++)
        {
            str = str + Integer.toString(expyear[i]);
        }
        assertThat("expiration_year начинается с 20", str, startsWith("20"));
    }

    @Test
    public void expirationYearGreaterOrEqual2018() {
        for(int i=2; i<expyear.length; i++)
        {
            str = str + Integer.toString(expyear[i]);
        }
        assertThat("expiration_year больше либо равен текущему году", Integer.valueOf(str), greaterThanOrEqualTo(18));
    }

}
