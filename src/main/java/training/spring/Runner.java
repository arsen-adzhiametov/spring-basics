package training.spring;

import training.spring.robot.TalkingRobot;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */
public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        TalkingRobot talkingRobot = context.getBean("talkingRobot", TalkingRobot.class);
        talkingRobot.talk();
    }
}
