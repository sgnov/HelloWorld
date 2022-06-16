package com.example.helloworld;


import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class SquareCalculatorTest {

    @Test
    public void testFindSquare() throws Exception {

        int square = SquareCalculator.findSquare(5,6);
        int expected = 5*6;

        assertThat(square).isEqualTo(expected);
    }

    @Test
    public void testFindPerimeter() throws Exception {

        int perimeter = SquareCalculator.findPerimeter(4,4);
        int expected = 16;

        assertThat(perimeter).isEqualTo(expected);

    }

}
