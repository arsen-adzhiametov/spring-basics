package training.postinitialiing;

import javax.annotation.PostConstruct;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class MyBean {

    public MyBean() {
        System.out.println("constructor called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("post construct called");
    }

    @PostInitialized
    public void postInitialized(){
        System.out.println("post initialized called");
    }
}
