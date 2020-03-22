package training.annotationbased.quoters.quoter;

import training.annotationbased.quoters.annotations.RunThisMethod;

/**
 * Created by Arsen Adzhiametov on 31-May-14 in IntelliJ IDEA.
 */
public class T1000 extends TerminatorQuoter {
    @Override
    public void sayQuote() {
        System.out.print("I am new T1000 terminator: ");
        super.sayQuote();
    }

    @Override
    @RunThisMethod(repeat = 1)
    public void sayName() {
        System.out.print("I am new T1000 terminator: ");
        super.sayName();
    }
}
