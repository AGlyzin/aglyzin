package ru.job4j.array;

/** Class BubbleSort - сортирует массив методом пузырька
 * @author AGlyzin
 * @since 09.09.2017
 * @version 1
 *
 */

public class BubbleSort {

    /**
     *
     * @param array передаем массив в метод sort
     * @return сортированный массив методом пузырька
     */

    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }
}