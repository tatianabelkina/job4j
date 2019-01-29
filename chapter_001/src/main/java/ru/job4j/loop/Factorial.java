package ru.job4j.loop;

/**
 * Факториал числа.
 * * author – Tatiana Belkina(stooliv@gmail.com).
 * * since – 15.01.2019;
 * * version – 0.1.
 */
public class Factorial {
    /**
     * Метод вычисления факториала числа.
     *
     * @param n - число для вычисления факториала
     */
    public int calc(int n) {
        int result = 1;

        for (int factor = 2; factor <= n; factor++) {
            result *= factor;
        }

        return result;
    }
}
