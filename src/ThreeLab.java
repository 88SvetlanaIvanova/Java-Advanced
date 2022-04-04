import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class ThreeLab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path ="C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced"+
                "\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources"
                +"\\input.txt";
        String pathTwo = "C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced"+
                "\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources"
                +"\\output3.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream(pathTwo);
        int value = inputStream.read();
        //Set<Character> punctuations = Set.of(',', '.', '!', '?');


        while (value != -1){

            System.out.println();
            if (value != 13 && value != 10 && value != 32)

            value = inputStream.read();
        }
    }
}
