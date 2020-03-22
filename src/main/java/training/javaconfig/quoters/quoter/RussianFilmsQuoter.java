package training.javaconfig.quoters.quoter;

import org.springframework.stereotype.Component;

/**
 * Created by Arsen Adzhiametov on 09-Jun-14 in IntelliJ IDEA.
 */
@Component
public class RussianFilmsQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Москва слезам не верит");
    }
}
