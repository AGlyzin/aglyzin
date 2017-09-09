package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** Class TurnTest служит для тестирования класса Turn
 *  @author AGlyzin
 *  @since 07.09.2017
 *  @version 1
 */

public class TurnTest {
    /** whenInvertedNotEvenArray - метод для тестирования массива, состоящего из нечетного числа элементов.
     *
     */
    @Test
    public void whenInvertedNotEvenArray() {
        Turn turn = new Turn();
        int[] array = {1,2,3,4,5};
        int[] expected = {5,4,3,2,1};
        int[] result = turn.back(array);
        assertThat(result,is(expected));
    }
    /** whenInvertedEvenArray - метод для тестирования массива, состоящего из четного числа элементов.
     *
     */
    @Test
    public void whenInvertedEvenArray() {
        Turn turn = new Turn();
        int[] array = {4,1,6,2};
        int[] expected = {2,6,1,4};
        int[] result = turn.back(array);
        assertThat(result,is(expected));
    }
}