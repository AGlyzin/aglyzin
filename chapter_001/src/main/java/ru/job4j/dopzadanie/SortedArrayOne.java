package ru.job4j.dopzadanie;

/**
 * class SortedArrayOne - checks sorted
 *
 * @author AGlyzin
 * @version 1.0
 * @since 08.10.2017
 */

public class SortedArrayOne {

    /**
     * @param value  - input array
     * @param revers - input constant
     * @return sorted or not/ true or false
     */

    public boolean isSorted(int[] value, boolean revers) {
        if (revers == false) {
            for (int i = 1; i < value.length; i++) {
                if (value[i] < value[i - 1]) return false;

            }
        } else {
            for (int i = 1; i < value.length; i++) {
                if (value[i] > value[i - 1]) return false;

            }
        }
        return true;
    }
}