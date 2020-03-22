package training.javaconfig.quoters.quoter;

import training.javaconfig.quoters.annotations.RunThisMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */

@Component
public class SheakSpearQuoter implements Quoter {

    @Value("${sheakSpearQuote}")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }

    @RunThisMethod(repeat = 1)
    public void sayName(){
        System.out.println("My name is Sheakspear");
    }
}
