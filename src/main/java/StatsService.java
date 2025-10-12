// StatsService.java
import java.util.List;

public class StatsService {

    // Метод для вычисления общей суммы продаж за год (по всем месяцам)
    public double totalSales(List<Integer> sales) {
        if (sales == null) {
            return 0.0; // Если список равен null, возвращаем 0
        }
        double total = 0.0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    // Метод для вычисления средней суммы продаж за месяц
    public double averageSales(List<Integer> sales) {
        if (sales == null || sales.isEmpty()) {
            return 0.0; // Если список пуст или null, возвращаем 0
        }
        return totalSales(sales) / sales.size();
    }
}
