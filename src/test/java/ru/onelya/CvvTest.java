package ru.onelya;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

/**
 * Created by user6 on 14.09.2018.
 */
public class CvvTest {

    Integer[] cvv = {4, 5, 4, 5};

    @Test
    public void cvvIsAllInt() {
        for (int i = 0; i<cvv.length; i++){
            assertThat("cvv состоит только из цифр", cvv[i], isA(Integer.class));
        }
    }

    @Test
    public void cvvIsLessThanOrEqualTo4() {
        assertThat("cvv не больше 4 символов", cvv.length, lessThanOrEqualTo(4));
    }

    @Test
    public void cvvIsGreaterThanOrEqualTo3() {
        assertThat("cvv не меньше 3 символов", cvv.length, greaterThanOrEqualTo(3));
    }
}
