import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TwoSumBytesEx {
    public static void main(String[] args) throws IOException {

        String pathStr = "C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        long sum = 0;
        for(byte value : Files.readAllBytes(Path.of(pathStr))){
            if (value != 10 && value != 13){
                sum += value;
            }
        }

        System.out.println(sum);

    }
}
