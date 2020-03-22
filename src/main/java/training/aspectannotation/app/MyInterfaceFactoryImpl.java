package training.aspectannotation.app;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class MyInterfaceFactoryImpl implements MyInterfaceFactory {

    @Override
    public MyInterfaceImpl createMyInterfaceImpl() {
        return new MyInterfaceImpl();
    }
}
