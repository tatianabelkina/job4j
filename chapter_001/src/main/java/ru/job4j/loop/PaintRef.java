package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Tatiana Belkina(stooliv@gmail.com).
 * @version $Id$
 * @since 29/01/2019
 */
public class PaintRef {
    /**
     * Рисует правую часть пирамиды
     *
     * @param height - высота пирамиды
     * @return - строка в псевдографике (правая часть пирамиды)
     */
    public String rightSideTriangle(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Рисует левую часть пирамиды
     *
     * @param height - высота пирамиды
     * @return - пирамиду в псевдографике (левую часть)
     */
    public String leftSideTriangle(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Рисует пирамиду в псевдографике
     *
     * @param height - высота пирамиды
     * @return - пирамиду в псевдографике
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}