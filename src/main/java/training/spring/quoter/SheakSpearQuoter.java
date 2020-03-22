package training.spring.quoter;

import training.spring.annotations.RunThisMethod;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */


public class SheakSpearQuoter implements Quoter {

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
