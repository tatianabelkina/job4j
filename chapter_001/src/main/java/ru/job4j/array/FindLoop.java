package ru.job4j.array;

public class FindLoop {
    /**
     * Array selection.
     * * author – Tatiana Belkina(stooliv@gmail.com).
     * * since – 01.02.2019;
     * * version – 0.1.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++)  {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
