package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayMergeTest - test class.
 * <p>
 * author – Tatiana Belkina(stooliv@gmail.com).
 * since – 28.02.2019.
 * version – 0.1.
 */
public class ArrayMegreSecondTest {

    /**
     * тест проверяет слияние двух отсортированных массивов.
     */
    @Test
    public void twoArrays() {
        int[] inputFirst = {0, 10};
        int[] inputSecond = {2, 6, 8, 12};
        ArrayMegre arraysMerge = new ArrayMegre();
        int[] result = arraysMerge.merging(inputFirst, inputSecond);
        int[] expected = new int[]{0, 2, 6, 8, 10, 12};
        assertThat(result, is(expected));
    }
}