package ru.job4j.dopzadanie;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class SortedArrayOneTest - testing class SortedArrayOne
 *
 * @author AGlyzin
 * @version 1.0
 * @since 08.10.2017
 */

public class SortedArrayOneTest {

    /**
     * whenCheckTheSortingOfAnArrayPoVozvrastaniy - тест-метод для проверки отсортирован ли массив по возврастанию
     */

    @Test
    public void whenCheckTheSortingOfAnArrayPoVozvrastaniy() {
        SortedArrayOne sortedArrayOne = new SortedArrayOne();
        int[] value = {4, 7, 9, 10, 22};
        boolean revers = false;
        boolean expected = true;
        boolean result = sortedArrayOne.isSorted(value, revers);
        assertThat(result, is(expected));
    }

    /**
     * whenCheckTheSortingOfAnArrayPoUbyvaniy - тест-метод для проверки отсортирован ли массив по убыванию
     */

    @Test
    public void whenCheckTheSortingOfAnArrayPoUbyvaniy() {
        SortedArrayOne sortedArrayOne = new SortedArrayOne();
        int[] value = {9, 7, 4, 2, 1};
        boolean revers = true;
        boolean expected = true;
        boolean result = sortedArrayOne.isSorted(value, revers);
        assertThat(result, is(expected));
    }
}