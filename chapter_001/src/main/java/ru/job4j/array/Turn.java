package ru.job4j.array;

/**
 * Array Turn.
 * * author – Tatiana Belkina(stooliv@gmail.com).
 * * since – 03.02.2019;
 * * version – 0.1.
 */
public class Turn {

    /**
     * Метод меняет местами элементы массива.
     *
     * @param array .
     * @return - turn array.
     */
    public int[] turn(int[] array) {
        // Цикл меняет местами 2 элемента массива, поэтому length / 2
        for (int i = 0; i < array.length / 2; i++) {
            int element = array[i];
            // length больше индекса последнего элеиента массива на 1.
            // Элементы первой половины массива заменяются на элементы второй половины массива.
            array[i] = array[array.length - i - 1];
            // Элементы второй половины массива через переменную element заменяются на Элементы первой половины массива.
            array[array.length - i - 1] = element;
        }
        return array;
    }
}
