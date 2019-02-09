package ru.job4j.array;

/**
 * Сортировка массива пузырьковым методом.
 * author – Tatiana Belkina(stooliv@gmail.com).
 * since – 04.02.2019;
 * version – 0.1.
 */
public class BubbleSort {

    /**
     * Соритровка массива.
     *
     * @param array .
     * @return отсортированный массив array.
     */
    public int[] sort(int[] array) {
        // количество элементов массива.
        int j = array.length - 1;
        // внешний цикл.
        // количество проходов равно индексу последнего элемента массива.
        while (j > 0) {
            // внутренний цикл.
            // за каждый цикл отсортировывается большее число.
            // формируется массив по возрастанию элементов.
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int element = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = element;
                }
            }
            j--;
        }
        return array;
    }

}