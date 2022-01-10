package directorycsv;

import java.io.File;
import java.io.IOException;

public class DirUtils {
    public static File createDirectory(String name) throws IOException {
        File file = new File(name);
        boolean wasCreated = file.mkdir();
        if (!wasCreated) {
            throw new IOException("Directory was created");
        }
        return file;
    }

    public static File createFileInDirectory(String name, String dirName) throws IOException {
        File file = new File(dirName, name);
        file.createNewFile();
        return file;
    }
}
