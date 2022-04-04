
import java.io.File;
        import java.nio.file.Path;

public class Eight8GetFolderSize {
    public static void main(String[] args) {
        String path = "E:\\LUIDGY\\BRAND_NEW_DAY\\04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources";
        File folder = new File(path);

        int folderSize = 0;
        for (File file : folder.listFiles()) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);

    }
}
