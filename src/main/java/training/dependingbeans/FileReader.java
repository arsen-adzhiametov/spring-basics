package training.dependingbeans;

import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.IOException;

/**
 * Created by Arsen Adzhiametov on 15-Jun-14 in IntelliJ IDEA.
 */
public class FileReader {

    @Value("${fileName}")
    public void init(String fileName) throws IOException {
        File file = new File(fileName+".txt");
        System.err.println("file length = " + file.length());
    }
}
