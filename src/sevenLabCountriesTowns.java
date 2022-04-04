import java.util.*;

public class sevenLabCountriesTowns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> countries = new LinkedHashMap<>();

        while (n-- >0 ){
            String[] tokens = scanner.nextLine().split("\\s+");

            String continent =tokens[0];
            String country =tokens[1];
            String city =tokens[2];

            countries.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> map = countries.get(continent);
            map.putIfAbsent(country, new ArrayList<>());
            List<String> cities = map.get(country);
            cities.add(city);

        }




        countries.forEach((key,value) ->{
            System.out.println(key + ":");

            value.forEach((key1, value1) -> System.out.println(" " + key1 + " -> "
            + String.join(", ", value1)));
        });

//        for (Map.Entry<String, Map<String, List<String>>> e : countries.entrySet()) {
//            System.out.println(e.getKey() + ":");
//
//            e.getValue().entrySet()
//                    .stream()
//                    .forEach(ie -> {
//                        // Bulgaria -> Sofia, Plovdiv
//                        System.out.println("  " + ie.getKey() + " -> "
//                                + String.join(", ", ie.getValue()));
//                    });
//        }
    }
}
