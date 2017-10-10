package ru.job4j.dopzadanie;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class WordInAnotherWordTest
 *
 * @author AGlyzin
 * @version 1
 * @since 08.10.2017
 */

public class WordInAnotherWordTest {

    /**
     * whenWordInAnotherWord - проверяет входит ли второе слово в первое
     */

    @Test
    public void whenWordInAnotherWord() {
        WordInAnotherWord wordInAnotherWord = new WordInAnotherWord();
        String origin = "Программирование";
        String sub = "грамм";
        boolean expected = true;
        boolean result = wordInAnotherWord.contains(origin, sub);
        assertThat(result, is(expected));
    }

    @Test
    public void whenWordInAnotherWord2() {
        WordInAnotherWord wordInAnotherWord = new WordInAnotherWord();
        String origin = "123";
        String sub = "21";
        boolean expected = true;
        boolean result = wordInAnotherWord.contains(origin, sub);
        assertThat(result, is(expected));
    }
}