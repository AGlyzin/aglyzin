package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**Class ArrayDuplicateTest для тестирования метода ArrayDuplicate
 * @author AGlyzin
 * @since 14.09.2017
 * @version 1
 */

public class ArrayDuplicateTest {
    @Test
    public void whenDelDuplicateArray() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(array);
        String[] expected = {"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}