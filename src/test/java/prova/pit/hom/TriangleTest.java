package prova.pit.hom;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static prova.pit.hom.TriangleType.*;

public class TriangleTest {
    @Test
    public void test1() {
        final TriangleType type = Triangle.classify(1, 2, 3);
        assertThat(type).isEqualByComparingTo(SCALENE);
    }

    @Test
    public void testInvalid1() {
        final TriangleType type = Triangle.classify(1, 2, 4);
        assertThat(type).isEqualByComparingTo(INVALID);
    }

    @Test
    public void testInvalid2() {
        final TriangleType type = Triangle.classify(1, 4, 2);
        assertThat(type).isEqualByComparingTo(INVALID);
    }

    @Test
    public void testInvalid3() {
        final TriangleType type = Triangle.classify(4, 1, 2);
        assertThat(type).isEqualByComparingTo(INVALID);

    }

    @Test
    public void testInvalidNeg1() {
        final TriangleType type = Triangle.classify(-1, 1, 1);
        assertThat(type).isEqualByComparingTo(INVALID);
    }

    @Test
    public void testInvalidNeg2() {
        final TriangleType type = Triangle.classify(1, -1, 1);
        assertThat(type).isEqualByComparingTo(INVALID);
    }

    @Test
    public void testInvalidNeg3() {
        final TriangleType type = Triangle.classify(1, 1, -1);
        assertThat(type).isEqualByComparingTo(INVALID);
    }

    @Test
    public void testEquilateral() {
        final TriangleType type = Triangle.classify(1, 1, 1);
        assertThat(type).isEqualByComparingTo(EQUILATERAL);
    }

    @Test
    public void testIsosceles1() {
        final TriangleType type = Triangle.classify(2, 2, 3);
        assertThat(type).isEqualByComparingTo(ISOSCELES);
    }

    @Test
    public void testIsosceles2() {
        final TriangleType type = Triangle.classify(2, 3, 2);
        assertThat(type).isEqualByComparingTo(ISOSCELES);
    }

    @Test
    public void testIsosceles3() {
        final TriangleType type = Triangle.classify(3, 2, 2);
        assertThat(type).isEqualByComparingTo(ISOSCELES);
    }

    @Test
    public void testInvalid() {
        final TriangleType type = Triangle.classify(3, 1, 1);
        assertThat(type).isEqualByComparingTo(INVALID);
    }
}
