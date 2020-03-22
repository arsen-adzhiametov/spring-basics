package training.spring.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

/**
 * Created by Arsen Adzhiametov on 31-May-14 in IntelliJ IDEA.
 */
public class DestroyMethodWarningLoggerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) configurableListableBeanFactory.getBeanDefinition(beanName);
            if (beanDefinition.isPrototype() && beanDefinition.getDestroyMethodName() != null) {
                System.err.println("PreDestroy method "+beanDefinition.getDestroyMethodName()+" is not compatible " +
                        "with prototype scope bean: "+ beanName);
            }
        }
    }
}
