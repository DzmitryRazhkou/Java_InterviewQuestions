package practise_java_questions.FilleHandling;

import java.io.File;
import java.util.Arrays;

public class PrintAllFilesAndFolderDirectorySorted {
    public static void main(String[] args) {

        String path = "/Users/dzmitryrazhkou/Downloads";
        File file = new File(path);
        File downloadsDir[] = file.listFiles();
        Arrays.sort(downloadsDir);

        for (File f : downloadsDir) {
            if (f.isFile()) {
                System.out.println("File : " + f.getName() + " " + f.getAbsolutePath());
            }
            else if  (f.isDirectory()) {
                System.out.println("Directory : " + f.getName() + " " + f.getAbsolutePath());
            }
            else {
                System.out.println("Unknown");
            }
        }

    }
}
