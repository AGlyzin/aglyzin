package ru.job4j.array;

import java.util.Arrays;

/**Class ArrayDuplicate - delete duplicate in array
 * @author AGlyzin
 * @since 14.09.2017
 * @version 1
 */

public class ArrayDuplicate {

    /**
     *
     * @param array - input array
     * @return - output array without duplicate
     */

    public String[] remove(String[] array) {
        int unique = array.length;
        for (int i = 0; i < unique; i++) {
            for (int j = i + 1; j < unique; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[unique - 1];
                    unique--;
                    j--;
                }
            }
        }
    return Arrays.copyOf(array, unique);
    }
}