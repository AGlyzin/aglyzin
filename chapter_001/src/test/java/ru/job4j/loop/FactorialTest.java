package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFindTheFactorialFive() {
        Factorial calcul = new Factorial();
        int result = calcul.calc(5);
        assertThat(result, is(120));
    }
    @Test
    public void whenFindTheFactorialNull() {
        Factorial calcul = new Factorial();
        int result = calcul.calc(0);
        assertThat(result, is(1));
    }
}

