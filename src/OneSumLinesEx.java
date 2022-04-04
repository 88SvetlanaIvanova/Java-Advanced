import javax.xml.xpath.XPath;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class OneSumLinesEx {
    public static void main(String[] args) throws IOException {
        String pathStr = "C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path path = Path.of(pathStr);
        List<String> allLines = Files.readAllLines(path);
        allLines.stream()
                .map(String :: toCharArray)  //str -> str.toCharArray
                .forEach(charArray ->
                {
                    int sum = 0;
                    for (char symbol : charArray) {
                        sum += symbol;
                    }
                    System.out.println(sum);
                });




    }
}
