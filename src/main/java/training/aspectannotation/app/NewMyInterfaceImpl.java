package training.aspectannotation.app;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class NewMyInterfaceImpl extends MyInterfaceImpl{
    @Override
    public void doWork() {
        System.out.println("I am NEW implementation");
    }
}
