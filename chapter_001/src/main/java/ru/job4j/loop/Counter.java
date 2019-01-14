package ru.job4j.loop;

/**
 * Подсчет суммы чётных чисел в диапазоне.
 * * author – Tatiana Belkina(stooliv@gmail.com);
 * * since – 13.01.2019;
 * * version – 0.1.
 */
public class Counter {
    /**
     * Метод вычисления суммы чётных чисел.
     *
     * @param start  начальное число
     * @param finish конечное число
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}
