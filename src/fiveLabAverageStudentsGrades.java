import java.util.*;

public class fiveLabAverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> resultsGrades = new TreeMap<>();
        while (n-- >0 ){
            String[] tokens = scanner.nextLine().split("\\s+");

            String studentName =tokens[0];
            double grade = Double.parseDouble(tokens[1]);


            resultsGrades.putIfAbsent(studentName, new ArrayList<>());
            resultsGrades.get(studentName).add(grade);


        }
        for (var entry: resultsGrades.entrySet()){
            List<Double> listGrades = entry.getValue();

            double sum = 0;
            for (double avg : listGrades) {
                 sum  += avg;

            }
            double average = sum/listGrades.size();
            System.out.printf("%s -> ", entry.getKey());
            listGrades.forEach(e -> {
                System.out.printf("%.2f ", e);
            });
            System.out.printf("(avg: %.2f)%n", average);
        }








    }
}
