package filehomework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = FileUtils.createNewFile("Test.txt");
            FileOutputStream fileOutputStream = FileUtils.writeInFile("Hello, My name is Vlad\n");
            File newFile = FileUtils.createNewFile("NewTest.txt");
            FileUtils.copyFilesUsingStream(file, newFile);
//            FileUtils.copyFilesUsingJavaFiles(file,newFile);
            FileUtils.newStringInFile("I'm 27 years old");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
