package ru.job4j.dopzadanie;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class SortedArrayTwoTest - testing class SortedArrayTwo
 *
 * @author AGlyzin
 * @version 1
 * @since 08.10.2017
 */

public class SortedArrayTwoTest {

    /**
     * whenCheckTheSortingOfAnArray - тест-метод, проверяет отсортирован ли объединенный массив по возврастанию
     */

    @Test
    public void whenCheckTheSortingOfAnArray() {
        SortedArrayTwo sortedArrayTwo = new SortedArrayTwo();
        int[] first = {1, 2, 3, 4};
        int[] second = {6, 7, 8, 9, 10};
        boolean expected = true;
        boolean result = sortedArrayTwo.checkSorted(first, second);
        assertThat(result, is(expected));

    }
}