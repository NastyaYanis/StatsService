package ru.netology.stats;

public class StatsService {

    // Метод для вычисления общей суммы продаж за год (по всем месяцам)
    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSales(long[] sales) {
        return totalSales(sales) / 12;

    }

    public int monthMaximum(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthMinimum(long[] sales) {
        int month = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthesBellowAverageMin(long[] sales) {
        long average = averageSales(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }
    public int monthesAboveAverageMax(long[] sales) {
        long average = averageSales(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }

}
