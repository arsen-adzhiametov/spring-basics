package training.contextlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
public class MyApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private MyBean myBean;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        myBean.doWork();
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }
}
