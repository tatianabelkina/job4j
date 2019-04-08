package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Tatiana Belkina.
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    private static final Random RN = new Random();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод, редактирование заявок.
     *
     * @param id   - уникальный ключ
     * @param item - изменяемый элемент
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                this.items[i] = item;
                this.items[i].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод, удаление заявок.
     *
     * @param id - уникальный ключ
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.position - i - 1);
                this.items[this.position - 1] = null;
                this.position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод пвозвращает копию массива this.items без null элементов.
     * получение списка всех заявок.
     *
     * @return массив Item
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод возвращает массив элементов, с парамером name = key.
     * получение списка по имени.
     *
     * @param key - наименование элемента
     * @return Массив Item
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int i = 0;
        for (Item item : this.items) {
            if (item != null && item.getName().equals(key)) {
                result[i++] = item;
            }
        }
        return Arrays.copyOf(result, i);
    }

    /**
     * Метод, ищет элемент массива по id.
     * получение заявки по id.
     *
     * @param id - уникальный ключ
     * @return - элемент массива Item
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}