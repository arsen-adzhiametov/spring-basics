package training.methodinjection;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * Created by Arsen Adzhiametov on 10-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@ComponentScan(basePackages = {"training.javaconfig"})
public class Config {

    @Bean(initMethod = "init")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public ColoredFrame frame(){
        ColoredFrame coloredFrame = new ColoredFrame(){
            @Override
            public Color getColor(){
               return randomColor();
            }
        };
        return coloredFrame;
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Color randomColor(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)){};
    }

}
