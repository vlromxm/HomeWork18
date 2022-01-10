package urlhomework;

import filehomework.FileUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class Url {
    public static void downLoadPicture(String https) throws IOException {
        URL url = new URL(https);
        Files.copy(url.openStream(), Paths.get("C:\\Users\\vlady\\IdeaProjects\\HomeWork18\\"+ UUID.randomUUID()+".jpg"));
    }
}
