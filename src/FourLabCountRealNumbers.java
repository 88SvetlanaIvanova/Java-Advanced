import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FourLabCountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values  = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> valuesAndOccurences = new LinkedHashMap<>();

        for (double value: values ) {
            if (!valuesAndOccurences.containsKey(value)){
                valuesAndOccurences.put(value, 1);
            }else{
                valuesAndOccurences.put(value, valuesAndOccurences.get(value) + 1);
            }
        }

        for (Double key : valuesAndOccurences.keySet()){
            System.out.println(String.format("%.1f -> %d", key, valuesAndOccurences.get(key)));
        }



    }
}
