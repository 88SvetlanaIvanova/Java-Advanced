import java.util.*;

public class SixLabShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Double>> shopWithPrices = new TreeMap<>();


        while (!input.equals("Revision")) {
            String[] params = input.split(", ");

            String shop = params[0];
            String product = params[1];
            double price = Double.parseDouble(params[2]);

            //is it added before or not

             shopWithPrices.putIfAbsent(shop,new LinkedHashMap<>());
                Map<String, Double>productsAndPrices = shopWithPrices.get(shop);
                productsAndPrices.put(product, price);
            
            input = scanner.nextLine();
        }

        for (String shop:shopWithPrices.keySet()) {
            System.out.println(shop + "->");
            for (var entry :shopWithPrices.get(shop).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",entry.getKey(), entry.getValue());
            }
        }
        
        }
}
