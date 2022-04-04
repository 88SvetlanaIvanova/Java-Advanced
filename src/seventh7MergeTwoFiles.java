
 import java.io.IOException;
 import java.io.PrintWriter;
 import java.nio.file.Files;
 import java.nio.file.Path;

 public class seventh7MergeTwoFiles{
     public static void main(String[] args) throws IOException {
         String pathOne = "C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt";
         String pathTwo = "C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt";
         String outputPath = "outputMerge.txt";

         PrintWriter writer = new PrintWriter(outputPath);
         Files.readAllLines(Path.of(pathOne))
                 .forEach(writer::println);
         Files.readAllLines(Path.of(pathTwo))
                 .forEach(writer::println);

         writer.close();

     }
 }
