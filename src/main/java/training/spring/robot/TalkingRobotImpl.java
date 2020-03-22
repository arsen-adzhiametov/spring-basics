package training.spring.robot;

import training.spring.annotations.Benchmark;
import training.spring.annotations.RunThisMethod;
import training.spring.annotations.Transaction;
import training.spring.quoter.Quoter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */

public class TalkingRobotImpl implements TalkingRobot {

    List<Quoter> quoters;

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

    public void setQuoters(List quoters) {
        this.quoters = quoters;
    }
}
