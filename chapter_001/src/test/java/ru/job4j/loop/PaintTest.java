package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    @Test
    public void whenBuildingPyramidIsTwo() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        final String line = System.getProperty("line.separator");
        String exepted = String.format(" ^ %s^^^%s", line, line);
        assertThat(result,is(exepted));
    }
    @Test
    public void whenBuildingPyramidIsThree() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        final String line = System.getProperty("line.separator");
        String exepted = String.format("  ^  %s ^^^ %s^^^^^%s", line, line, line);
        assertThat(result,is(exepted));
    }
}


