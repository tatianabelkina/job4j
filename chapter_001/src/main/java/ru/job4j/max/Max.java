package ru.job4j.max;

/**
 * @author Tatiana Belkina(stooliv@gmail.com)
 * @version $Id$
 * @since 06.01.2019
 */

public class Max {
    /**
     * Максимальное из двух чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @return наибольшее из двух чисел.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Максимальное из трех чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @param third  третье число.
     * @return наибольшее из трех чисел.
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
