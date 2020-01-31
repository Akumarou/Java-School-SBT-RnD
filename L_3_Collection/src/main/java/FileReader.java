import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String> ReadFromFile(String path) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(new File(path));
        while (in.hasNextLine())
            list.add(in.nextLine());
        return list;
    }
}
