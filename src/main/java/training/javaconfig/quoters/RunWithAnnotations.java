package training.javaconfig.quoters;

import training.javaconfig.quoters.robot.TalkingRobot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Arsen Adzhiametov on 18-May-14 in IntelliJ IDEA.
 */
public class RunWithAnnotations {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        TalkingRobot talkingRobot = context.getBean(TalkingRobot.class);
        talkingRobot.talk();
    }
}
