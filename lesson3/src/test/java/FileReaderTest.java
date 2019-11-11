import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void readFromFile() {
        ArrayList<String> compared = new ArrayList<String>();
        compared.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque placerat maximus vestibulum.");
        compared.add("Curabitur pellentesque turpis quis ligula molestie, accumsan efficitur sapien tempus.");
        compared.add("Nulla pretium purus metus, ac efficitur felis scelerisque non. Vivamus nec ornare mauris.");
        compared.add("Integer non viverra dolor. Maecenas dignissim tempus quam in semper.");
        compared.add("Suspendisse sodales urna eu odio consectetur, a mollis sem euismod euismod euismod .");
        try {
            assertEquals(compared, FileReader.ReadFromFile("lesson3/src/main/resources/File.txt"));
        } catch (IOException e) {}
        ArrayList<String> comparedEmpty = new ArrayList<String>();
        try {
            assertEquals(comparedEmpty, FileReader.ReadFromFile("lesson3/src/main/resources/EmptyFile.txt"));
        } catch (IOException e) {}
    }
}