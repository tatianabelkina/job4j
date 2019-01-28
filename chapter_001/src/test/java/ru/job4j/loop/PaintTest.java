package ru.job4j.loop;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

    /**
     * Class PaintTest.
     *
     * @author Tatiana Belkina(stooliv@gmail.com).
     * @since 28.01.2019.
     */

    public class PaintTest {
        @Test
        public void whenPyramid2Right() {
            Paint paint = new Paint();
            String result = paint.pyramid(2);
            System.out.println(result);
            assertThat(result, is(
                    new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                            .add(" ^ ")
                            .add("^^^")
                            .toString()


                    )
            );
        }

        @Test
        public void whenPyramid4Right() {
            Paint paint = new Paint();
            String result = paint.pyramid(3);
            System.out.println(result);
            assertThat(result, is(
                    new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                            .add("  ^  ")
                            .add(" ^^^ ")
                            .add("^^^^^")
                            .toString()


                    )
            );
        }
    }

