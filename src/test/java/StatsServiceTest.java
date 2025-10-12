// StatsServiceTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class StatsServiceTest {

    // Тест для метода totalSales
    @Test
    public void testTotalSales() {
        StatsService statsService = new StatsService();

        // Данные для теста (продажи по месяцам)
        List<Integer> sales = Arrays.asList(8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18);

        // Ожидаемый результат: сумма всех продаж
        double expectedTotal = 180.0;

        // Проверяем, что результат совпадает
        assertEquals(expectedTotal, statsService.totalSales(sales), "Total sales should be 180.0");
    }

    // Тест для метода averageSales
    @Test
    public void testAverageSales() {
        StatsService statsService = new StatsService();

        // Данные для теста (продажи по месяцам)
        List<Integer> sales = Arrays.asList(8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18);

        // Ожидаемый результат: средняя сумма продаж
        double expectedAverage = 15.0;

        // Проверяем, что результат совпадает
        assertEquals(expectedAverage, statsService.averageSales(sales), "Average sales should be 15.0");
    }

    // Тест на случай пустого списка
    @Test
    public void testEmptySalesList() {
        StatsService statsService = new StatsService();

        // Пустой список
        List<Integer> sales = Arrays.asList();

        // Проверяем, что для пустого списка сумма и среднее = 0.0
        assertEquals(0.0, statsService.totalSales(sales), "Total sales should be 0.0 for empty list");
        assertEquals(0.0, statsService.averageSales(sales), "Average sales should be 0.0 for empty list");
    }

    // Тест на null список
    @Test
    public void testNullSalesList() {
        StatsService statsService = new StatsService();

        // null список
        List<Integer> sales = null;

        // Проверяем, что для null списка сумма и среднее = 0.0
        assertEquals(0.0, statsService.totalSales(sales), "Total sales should be 0.0 for null list");
        assertEquals(0.0, statsService.averageSales(sales), "Average sales should be 0.0 for null list");
    }
}
