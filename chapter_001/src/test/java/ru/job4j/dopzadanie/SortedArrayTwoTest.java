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
        int[] first = {1, 6, 8, 10};
        int[] second = {4, 5, 7, 9, 13};
        int[] expected = {1, 4, 5, 6, 7, 8, 9, 10, 13};
        int[] result = sortedArrayTwo.isSortedArray(first, second);
        assertThat(result, is(expected));

    }
}