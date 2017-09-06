package ru.job4j.loop;

/** Class Paint построение пирамиды в псевдографике [#4412]
 *  @author AGlyzin
 *  @since 06.09.2017
 *  @version 1
 */

public class Paint {

    /**
     * @param h - height of the pyramid
     * @return pyramid
     */

    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        int w = 1;
        int n = h;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n - 1; j++) {
                builder.append(" ");
            }
            for (int j = 0; j < 2 * w - 1; j++) {
                builder.append("^");
            }
            for (int k = 0; k < n - 1; k++) {
                builder.append(" ");
            }

            builder.append("\r\n");
            w++;
            n--;

        }
        return builder.toString();
    }
}