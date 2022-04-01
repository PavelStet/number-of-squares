package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldSquareQuantityCalcThreeSquares() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqrService(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSquareQuantityCalcMinSquares() {
        SQRService service = new SQRService();
        int excepted = 1;
        int actual = service.sqrService(100, 125);
        assertEquals(excepted, actual);
    }

    @Test
    void shouldSquareQuantityCalcZeroSquares() {
        SQRService service = new SQRService();
        int excepted = 0;
        int actual = service.sqrService(6, 7);
        assertEquals(excepted, actual);
    }

    @Test
    void shouldSquareQuantityCalcMaxSquares() {
        SQRService service = new SQRService();
        int excepted = 90;
        int actual = service.sqrService(1, 10000);
        assertEquals(excepted, actual);
    }
}



