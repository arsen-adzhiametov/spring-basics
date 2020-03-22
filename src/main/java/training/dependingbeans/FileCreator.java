package training.dependingbeans;

import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.IOException;

/**
 * Created by Arsen Adzhiametov on 15-Jun-14 in IntelliJ IDEA.
 */
public class FileCreator {

    @Value("${fileName}")
    public void init(String fileName){
        File file = new File(fileName+".txt");
        try {
            file.createNewFile();
            System.err.println("file created");;
        } catch (IOException e) {
            System.err.println(e);;
        }
    }
}
