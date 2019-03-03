package ru.job4j.array;

/**
 * Получение одного отсортированного массива из двух.
 * author – Tatiana Belkina(stooliv@gmail.com).
 * since – 26.02.2019.
 * version – 0.1.
 */

public class Megre {

    /**
     * Метод объединяет два отсортированных массива и возвращает общий отсортированный массив.
     *
     * @param left  первый отсортированнвй массив.
     * @param right второй отсортированный массив.
     * @return отсортированный результирующий массив rsl.
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int rslPoint = 0;
        while (leftPoint + rightPoint != rsl.length) {
            if (leftPoint != left.length && rightPoint != right.length) {
                rsl[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
            } else if (leftPoint != left.length) {
                rsl[rslPoint++] = left[leftPoint++];
            } else {
                rsl[rslPoint++] = right[rightPoint++];
            }
        }
        return rsl;
    }
}
