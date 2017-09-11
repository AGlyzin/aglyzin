package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**Class RotateArrayTest для тестирования класса RotateArray
 * @author AGlyzin
 * @since 11.09.2017
 * @version 1
 */

public class RotateArrayTest {

    /** whenRotateArray3x3 - метод для тестирования массива 3 на 3
     *
     */

    @Test
    public void whenRotateArray3x3() {
        RotateArray rotateArray = new RotateArray();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] result = rotateArray.rotate(array);
        assertThat(result, is(expected));
    }

    /** whenRotateArray2x2 - метод для тестирования массива 2 на 2
     *
     */

    @Test
    public void whenRotateArray2x2() {
        RotateArray rotateArray = new RotateArray();
        int[][] array = {{1, 2}, {3, 4}};
        int[][] expected = {{3, 1}, {4, 2}};
        int[][] result = rotateArray.rotate(array);
        assertThat(result, is(expected));
    }
}