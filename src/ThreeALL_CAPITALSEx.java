import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThreeALL_CAPITALSEx {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        //Files.readAllLines(Path.of(path))
        //      .forEach(str -> System.out.println(str.toUpperCase()));
        var writer = new BufferedWriter(new FileWriter("output.txt"));
        // FileOutputStream outputStream = new FileOutputStream("output.txt");
        Files.readAllLines(Path.of(path))
                .forEach(str -> {
                    try {
                        writer.write(str.toUpperCase());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.close();
    }
}
