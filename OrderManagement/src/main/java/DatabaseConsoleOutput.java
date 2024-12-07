import java.util.HashMap;
import java.util.Map;

public class DatabaseConsoleOutput {
    public static void main(String[] args) {
        Map<String, Object> order = new HashMap<>();
        order.put("orderId", "O123");
        order.put("productName", "Laptop");
        order.put("quantity", 2);
        order.put("orderDate", "2024-12-07");
        order.put("customerName", "John Doe");

        System.out.println("{");
        for (Map.Entry<String, Object> entry : order.entrySet()) {
            System.out.printf("  \"%s\": \"%s\",\n", entry.getKey(), entry.getValue());
        }
        System.out.println("}");
    }
}
