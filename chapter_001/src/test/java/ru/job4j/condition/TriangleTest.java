package ru.job4j.condition;

        import org.junit.Test;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;
        import static org.hamcrest.number.IsCloseTo.closeTo;


public class TriangleTest{
    @Test
    public void whenAreaSetThreeTriangleArea() {
        Point a = new Point(0,0);
        Point b = new Point(0,2);
        Point c = new Point(2,0);

        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, is(closeTo(2.0, 0.1)));

    }
}