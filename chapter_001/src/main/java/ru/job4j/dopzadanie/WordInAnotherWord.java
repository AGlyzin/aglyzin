package ru.job4j.dopzadanie;

/**
 * Class WordInAnotherWord
 *
 * @author Aglyzin
 * @version 1
 * @since 08.10.2017
 */

public class WordInAnotherWord {

    /**
     * @param origin - one word
     * @param sub    - two word
     * @return - oneword(twoword) true or false
     */

    public boolean contains(String origin, String sub) {
        char[] first = origin.toCharArray();
        char[] second = sub.toCharArray();
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {

                if (second[i] == first[j]) break;

                if (j == first.length - 1) return false;

            }
        }
        return true;
    }

}