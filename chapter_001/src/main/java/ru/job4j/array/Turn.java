package ru.job4j.array;

/** Class Turn Перевернуть массив [#4441]
 * @author AGlyzin
 * @since 07.09.2017
 * @version 1
 */

public class Turn {
    /**
     *
     * @param array передаем массив в метод back
     * @return перевернутый массив array
     */
    public int[] back(int[] array) {
        for (int i = 0; array.length/2 > i; i++) {

            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        return array;
    }
}