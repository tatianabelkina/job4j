package ru.job4j.tracker;

import java.util.List;

/**
 * Interface for ConsoleInput.
 *
 *@author Tatiana Belkina.
 *@version $Id$
 */
interface Input {

    String ask(String question);
    int ask(String question, List<Integer> range);

}
