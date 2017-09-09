package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** Class BubbleSortTest для тестирования класса BubbleSort
 * @author AGlyzin
 * @since 09.09.2017
 * @version 1
 */
public class BubbleSortTest {

    /** whenBubbleSortArray - метод для тестирования массива методом пузырька
     *
     */

    @Test
    public void whenBubbleSortArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5,1,2,7,3};
        int[] expected = {1,2,3,5,7};
        int[] result = bubbleSort.sort(array);
        assertThat(result,is(expected));
    }
}