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
     * @return boolean - true - все значения одинаковы, false - не все одинаковы
     */

    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}