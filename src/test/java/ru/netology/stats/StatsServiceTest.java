package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void calculateSumForSales() {
        int expected = 180;
        int actual = service.calculateSumForSales(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSale() {
        double expected = 15;
        double actual = service.calculateAverageSale(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateNumberLastMaxSale() {
        int expected = 8;
        int actual = service.calculateNumberLastMaxSale(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateNumberLastMinSale() {
        int expected = 9;
        int actual = service.calculateNumberLastMinSale(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateQuantityBelowAverage() {
        int expected = 5;
        int actual = service.calculateQuantityBelowAverage(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateQuantityAboveAverage() {
        int expected = 5;
        int actual = service.calculateQuantityAboveAverage(monthlySales);
        assertEquals(expected, actual);

    }
}