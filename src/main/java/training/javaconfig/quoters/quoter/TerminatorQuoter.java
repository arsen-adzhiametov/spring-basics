package training.javaconfig.quoters.quoter;

import training.javaconfig.quoters.annotations.MyDeprecated;
import training.javaconfig.quoters.annotations.RunThisMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */
@MyDeprecated(newClass = T1000.class)
@Component
public class TerminatorQuoter implements Quoter {

    @Value("${terminatorQuotes}")
    private String[] messages;

    @Override
    public void sayQuote() {
        System.out.println("messages = " + Arrays.asList(messages));
    }

    @RunThisMethod(repeat = 1)
    public void sayName(){
        System.out.println("My name is Terminator");
    }

}
