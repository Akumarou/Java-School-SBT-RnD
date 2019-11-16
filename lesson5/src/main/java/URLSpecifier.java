import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLSpecifier {
    public static void readContent(String url) throws IOException {
        Object content = new URL(url).getContent();
        if (content instanceof InputStream) {
            InputStream contentStream = (InputStream) content;
            try (Scanner contentScanner = new Scanner(contentStream)) {
                while (contentScanner.hasNext()) {
                    System.out.println(contentScanner.next());
                }
            }
        } else {
            throw new IOException("Unsupported content kind");
        }
    }
}

