package pro.sky.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
private CalculatorService cs;
private Integer a, b, c, d;

    @BeforeEach
    void setUp() {
        cs = new CalculatorService();
        a = 5;
        b = 8;
        c = -5;
        d = -8;
    }

    @Test
    void plus() throws Exception {
     assertEquals(13, cs.plus(a,b));
     assertEquals(-13, cs.plus(c,d));
    }

    @Test
    void minus() throws Exception {
        assertEquals(-3,cs.minus(a, b));
        assertEquals(3,cs.minus(c,d));
    }

    @Test
    void multiply() throws Exception {
        assertEquals(40,cs.multiply(a, b));
        assertEquals(40,cs.multiply(c, d));
    }

    @Test
    void divide() throws Exception {
        assertEquals(0,cs.divide(a, b));
        assertEquals(0,cs.divide(c, d));
        assertThrows(IllegalArgumentException.class, () -> cs.divide(a, 0));
    }

    @ParameterizedTest
    @MethodSource("dataTestPlus")
    public void testPlus (Integer n1, Integer n2, Integer expected) throws Exception {
        assertEquals(expected,cs.plus(n1, n2));
    }
    @ParameterizedTest
    @MethodSource("dataTestMinus")
    public void testMinus (Integer n1, Integer n2, Integer expected) throws Exception {
        assertEquals(expected,cs.minus(n1, n2));
    }

    @ParameterizedTest
    @MethodSource("dataTestMultiply")
    public void testMultiply (Integer n1, Integer n2, Integer expected) throws Exception {
        assertEquals(expected,cs.multiply(n1, n2));
    }

    @ParameterizedTest
    @MethodSource("dataTestDevide")
    public void testDevide (Integer n1, Integer n2, Integer expected) throws Exception {
        assertEquals(expected,cs.divide(n1, n2));
    }

    public static Stream<Arguments> dataTestPlus () {
        return Stream.of(
                Arguments.of(5,8,13),
                Arguments.of(-5,-8,-13)
        );
    }
    public static Stream<Arguments> dataTestMinus () {
        return Stream.of(
                Arguments.of(5,8,-3),
                Arguments.of(-5,-8,3)
        );
    }
    public static Stream<Arguments> dataTestMultiply () {
        return Stream.of(
                Arguments.of(5,8,40),
                Arguments.of(-5,-8,40)
        );
    }
    public static Stream<Arguments> dataTestDevide () {
        return Stream.of(
                Arguments.of(5,8,0),
                Arguments.of(-5,-8,0)
        );
    }
}