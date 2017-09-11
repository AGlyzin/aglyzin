package ru.job4j.array;

/**Class RotateArray Поворот матрицы на 90 градусов по часовой стрелки [#223]
 * @author AGlyzin
 * @since 11.09.2017
 * @version 1
 */

public class RotateArray {

    /**
     *
     * @param array входной массив
     * @return массив повернутый на 90 градусов по часовой
     */

    public int[][] rotate(int[][] array) {
        int l = array.length;
        for (int i = 0; i < l/2; i++) {
            for (int j = i; j < l-1-i; j++) {
                int tmp = array[i][j];
                array[i][j] = array[l-j-1][i];
                array[l-j-1][i] = array[l-1-i][l-1-j];
                array[l-1-i][l-1-j] = array[j][l-i-1];
                array[j][l-i-1] = tmp;
            }
        }
    return array;
    }
}