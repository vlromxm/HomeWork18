package urlhomework;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class Url {
    public static void downLoadPicture(String https) throws IOException {
        URL url = new URL(https);
        Files.copy(url.openStream(), Paths.get("C:\\Users\\vlady\\IdeaProjects\\HomeWork18\\" + UUID.randomUUID() + ".jpg"));
    }
}
