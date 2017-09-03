package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest{
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max2(6, 4, 5);
        assertThat(result, is(6));
    }

    @Test
    public void whenThreeMoreSecond() {
        Max maxim = new Max();
        int result = maxim.max2(8, 16,22);
        assertThat(result, is(22));
    }

    @Test
    public void whenOneLessFiveLess6() {
        Max maxim = new Max();
        int result = maxim.max2(9, 5,6);
        assertThat(result, is(9));
    }
}