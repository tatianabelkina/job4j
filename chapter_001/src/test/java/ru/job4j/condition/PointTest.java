package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * @author Tatiana Belkina(stooliv@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {

    private double accuracy = 0.0002;

    @Test
    public void shouldReturnDistanceToArgument() {
        Point firstPoint = new Point(0, 0);
        assertThat(firstPoint.distanceTo(new Point(2, 2)), is(closeTo(2.828427124, accuracy)));
    }
}