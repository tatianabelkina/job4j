package ru.job4j.array;

/**
 * Двухмерный массив. Таблица умножения.
 * author – Tatiana Belkina(stooliv@gmail.com).
 * since – 09.02.2019;
 * version – 0.1.
 */
public class Matrix {
    /**
     * Заполняется таблица умножения.
     *
     * @param size - размерность таблицы.
     * @return массив table.
     */

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
