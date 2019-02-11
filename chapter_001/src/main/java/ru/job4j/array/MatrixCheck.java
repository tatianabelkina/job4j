package ru.job4j.array;

/**
 * Двухмерный массив. Равные диагонали.
 * author – Tatiana Belkina(stooliv@gmail.com).
 * since – 09.02.2019.
 * version – $Id$.
 */

public class MatrixCheck {
    /**
     * Проверка логического равенства элементов диагоналей мантрицы.
     *
     * @param data .
     * @return true or false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        // матрица квадратная, берем длину первой строки data[0].length
        int row0 = data[0].length;
        // цикл по элементам строки.
        for (int i = 0; i < row0 - 1; i++) {
            // (data[i][i] != data[i + 1][i + 1] - элементы левой диагонали.
            // data[i][row0 - 1 - i] != data[i + 1][row0 - i - 2]) - элементы правой диагонали.
            // проверка логического неравенства элементов диагоналей.
            if (data[i][i] != data[i + 1][i + 1] || data[i][row0 - 1 - i] != data[i + 1][row0 - i - 2]) {
                result = false;
                break;
            }
        }
        return result;
    }
}



