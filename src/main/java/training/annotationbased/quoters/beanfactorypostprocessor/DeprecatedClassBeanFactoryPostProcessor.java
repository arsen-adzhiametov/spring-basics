package training.annotationbased.quoters.beanfactorypostprocessor;

import training.annotationbased.quoters.annotations.MyDeprecated;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Created by Arsen Adzhiametov on 31-May-14 in IntelliJ IDEA.
 */
@Component
public class DeprecatedClassBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            try {
                Class<?> originalClass = Class.forName(beanClassName);
                MyDeprecated annotation = originalClass.getAnnotation(MyDeprecated.class);
                if(annotation!=null) {
                    beanDefinition.setBeanClass(annotation.newClass());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
