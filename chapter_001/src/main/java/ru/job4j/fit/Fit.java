package ru.job4j.fit;

/**
 * Программа расчета идеального веса.
 *  * author – Tatiana Belkina(stooliv@gmail.com);
 *  * since – 27.12.2018;
 *  * version – 0.1.
 */
public class Fit {

    /**
     * Идеальный вес для мужчины.
     * @param height Рост.
     * @return идеальный вес мужчины.
     */
    public double manWeight(double height) {
        return (height-100D)*1.15;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес женщины.
     */
    public double womanWeight(double height) {
        return (height-110D)*1.15;
    }
}