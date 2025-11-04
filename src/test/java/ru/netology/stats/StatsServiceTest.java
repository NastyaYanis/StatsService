package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testTotalSale() {
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};  // массив с продажами
        StatsService statsService = new StatsService();  // создаем объект StatsService

        long actual = statsService.totalSales(sale);  // вызываем метод totalSale
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;  // сумма всех продаж
        Assertions.assertEquals(expected, actual);  // проверка, что результат совпадает
    }

    @Test
    public void testAverageSale() {
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.averageSales(sale);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testManthMaximumSale() {
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthMaximum(sale);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMinimumSale() {
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthMinimum(sale);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthBellowAverageMin() {
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthesBellowAverageMin(sale);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthesAboveAverageMax() {
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthesAboveAverageMax(sale);
        long expected = 5;  // исправлено: реально выше среднего 5 месяцев
        Assertions.assertEquals(expected, actual);
    }

}

