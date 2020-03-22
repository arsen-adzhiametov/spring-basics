package training.annotationbased.quoters;

import training.annotationbased.quoters.robot.TalkingRobot;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */
public class RunWithAnnotations {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation-config.xml");
        TalkingRobot talkingRobot = context.getBean(TalkingRobot.class);
        talkingRobot.talk();
    }
}
