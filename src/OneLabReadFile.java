import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class OneLabReadFile {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String path ="C:\\Users\\Svetla\\Alice\\OneDrive - Geneolo\\Desktop\\JavaAdvanced"+
                "\\04-Streams-Files-Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources"
                +"\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        int value = inputStream.read();

        while (value != -1){
            System.out.print(Integer.toBinaryString(value) + " ");
            value = inputStream.read();
        }


    }
}
