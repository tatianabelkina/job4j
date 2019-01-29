package ru.job4j.loop;

/**
 * Class Board.
 *
 * @author Tatiana Belkina (stooliv@gmail.com).
 * @since 18.01.2019.
 */
public class Board {

    /**
     * Метод paint рисует шахматную доску из символов Х и пробелов.
     *
     * @param width  ширина таблицы.
     * @param height длина таблицы.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);

        }
        return screen.toString();
    }

}