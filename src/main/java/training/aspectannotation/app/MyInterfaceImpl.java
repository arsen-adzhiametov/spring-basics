package training.aspectannotation.app;

import training.annotationbased.quoters.annotations.MyDeprecated;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
@MyDeprecated(newClass = NewMyInterfaceImpl.class)
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void doWork() {
        System.out.println("I am deprecated implementation");
    }
}
