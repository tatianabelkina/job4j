package ru.job4j.array;

/**
 * Array Check.
 * author – Tatiana Belkina(stooliv@gmail.com).
 * since – 04.02.2019;
 * version – 0.1.
 */
public class Check {
    /**
     * Метод проверяет, что все элементы в массиве являются true или false.
     *
     * @param data .
     * @return - true or false.
     */

    public boolean mono(boolean[] data) {
        // цикл по элементам массива data.
        // индекс i последнего элемента массива меньше length на 1.
        // Поэтому length -1.
        for (int i = 0; i < data.length - 1; i++) {
            // цикл сравнивает два соседних элемента массива.
            if (data[i] != data[i + 1]) {
                return false;
            }
        }
        return true;
    }


}