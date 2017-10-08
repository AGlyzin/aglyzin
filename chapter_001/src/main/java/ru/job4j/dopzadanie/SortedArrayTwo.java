package ru.job4j.dopzadanie;

/**
 * Class SortedArrayTwo - checks sorted
 *
 * @author AGlyzin
 * @version 1
 * @since 08.10.2017
 */

public class SortedArrayTwo {

    /**
     * @param first  - array sorted ↑
     * @param second - array sorted ↑
     * @return sorted or not/ true or false
     */

    public boolean checkSorted(int[] first, int[] second) {

        int[] three = new int[first.length + second.length];

        System.arraycopy(first, 0, three, 0, first.length);

        System.arraycopy(second, 0, three, first.length, second.length);

        for (int i = 0; i < three.length - 1; i++) {

            if (three[i] > three[i + 1]) return false;

        }

        return true;
    }
}