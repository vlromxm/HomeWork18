package filehomework;

import java.io.*;
import java.nio.file.Files;

public class FileUtils {
    public static File createNewFile(String name) throws IOException {
        File file = new File(name);
        file.createNewFile();
        return file;
    }

    public static FileOutputStream writeInFile(String text) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vlady\\IdeaProjects\\HomeWork18\\Test.txt");
        fileOutputStream.write(text.getBytes());
        fileOutputStream.close();
        return fileOutputStream;
    }

    public static void copyFilesUsingStream(File file, File newFile) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(file);
            os = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void copyFilesUsingJavaFiles(File file, File newFile) throws IOException {
        Files.copy(file.toPath(), newFile.toPath());
    }

    public static FileOutputStream newStringInFile(String text) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vlady\\IdeaProjects\\HomeWork18\\Test.txt", true);
        fileOutputStream.write(text.getBytes());
        fileOutputStream.close();
        return fileOutputStream;
    }


}
