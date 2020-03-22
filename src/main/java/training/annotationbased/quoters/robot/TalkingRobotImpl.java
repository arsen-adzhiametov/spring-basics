package training.annotationbased.quoters.robot;

import training.annotationbased.quoters.annotations.Benchmark;
import training.annotationbased.quoters.annotations.RunThisMethod;
import training.annotationbased.quoters.annotations.Transaction;
import training.annotationbased.quoters.quoter.Quoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private List<Quoter> quoters;

    @Override
    @PostConstruct
    @Benchmark
    @Transaction
    public void talk(){
        for(Quoter quoter : quoters){
            quoter.sayQuote();
        }
    }

    @RunThisMethod(repeat = 1)
    public void sayName(){
        System.out.println("My name is Talking Robot");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("I am robot and I am dying");
    }

}
