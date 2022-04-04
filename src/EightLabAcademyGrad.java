import java.text.DecimalFormat;
import java.util.*;

public class EightLabAcademyGrad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double[]>graduatesResults = new TreeMap<>();
        while (n-- > 0 ){
          //  String tokens = scanner.nextLine();

            String studentName =scanner.nextLine();
            String [] scores = scanner.nextLine().split("\\s+");
            Double []grade = new Double[scores.length];
            for (int i = 0; i <scores.length ; i++) {
                grade[i] = Double.parseDouble(scores[i]);
            }

         //   graduatesResults.putIfAbsent(studentName, new ArrayList<>());
            graduatesResults.put(studentName, grade);

        }
        //decimal format"#.##########"

        for (var entry: graduatesResults.entrySet()){
            List<Double> listGrades = Arrays.asList(entry.getValue());

            double sum = 0;
            for (double avg : listGrades) {
                sum  += avg;

            }
            double average = sum/listGrades.size();

            System.out.printf("%s is graduated with ", entry.getKey());

            System.out.print( new DecimalFormat("#.####################").format(average));
            System.out.println();

        }
    }
}
