import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class TwoLab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path ="C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced"+
                "\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources"
                +"\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        int value = inputStream.read();
        Set<Character> punctuations = Set.of(',', '.', '!', '?');


        while (value != -1){
            char current = (char)value;
            if (!punctuations.contains(current))
            System.out.print(current);
            value = inputStream.read();
        }
    }
}
