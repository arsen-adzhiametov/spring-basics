package training.aspectannotation;

import training.aspectannotation.app.DeprecatedReplacerAspect;
import training.aspectannotation.app.MyInterfaceFactory;
import training.aspectannotation.app.MyInterfaceFactoryImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Arsen Adzhiametov on 22-Jun-14 in IntelliJ IDEA.
 */
@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public MyInterfaceFactory myInterfaceFactory(){
        return new MyInterfaceFactoryImpl();
    }

    @Bean
    public DeprecatedReplacerAspect deprecatedReplacerAspect(){
        return new DeprecatedReplacerAspect();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        context.getBean(MyInterfaceFactory.class).createMyInterfaceImpl().doWork();

    }
}
