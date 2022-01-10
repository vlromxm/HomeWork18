package urlhomework;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UrlTest {
    @Test
     public void shouldExistsPicture() throws IOException {
        Url.downLoadPicture("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        File file = new File("C:\\Users\\vlady\\IdeaProjects\\HomeWork18\\be5f212b-ef47-4373-90e4-2b4e15082e2e.jpg");
        Assertions.assertTrue(file.exists(),"be5f212b-ef47-4373-90e4-2b4e15082e2e.jpg");
        Assertions.assertTrue(file.isFile());
    }



}