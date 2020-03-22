package training.annotationbased.quoters.quoter;

import training.annotationbased.quoters.annotations.MyDeprecated;
import training.annotationbased.quoters.annotations.RunThisMethod;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */
@MyDeprecated(newClass = T1000.class)
public class TerminatorQuoter implements Quoter {

    private List<String> messages = Arrays.asList("полюбому");

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void sayQuote() {
        System.out.println("messages = " + messages);
    }

    @RunThisMethod(repeat = 1)
    public void sayName(){
        System.out.println("My name is Terminator");
    }

}
