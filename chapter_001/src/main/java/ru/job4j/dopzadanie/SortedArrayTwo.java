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
     * @return sorted three array
     */

    public int[] isSortedArray(int[] first, int[] second) {

        int[] three = new int[first.length + second.length];

        System.arraycopy(first, 0, three, 0, first.length);

        System.arraycopy(second, 0, three, first.length, second.length);

        int l = three.length;

        for (int i = l - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (three[j] > three[j + 1]) {
                    int tmp = three[j];
                    three[j] = three[j + 1];
                    three[j + 1] = tmp;
                }
            }
        }

        return three;
    }
}
