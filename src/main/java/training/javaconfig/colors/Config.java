package training.javaconfig.colors;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

/**
 * Created by Arsen Adzhiametov on 10-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@ComponentScan(basePackages = {"training.javaconfig"})
public class Config {

    @Bean(initMethod = "init")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public ColoredFrame frame(){
        ColoredFrame coloredFrame = new ColoredFrame();
        coloredFrame.setColor(randomColor());
        return coloredFrame;
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Color randomColor(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}
