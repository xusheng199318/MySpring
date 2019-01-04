package org.litespring.context.support;

import org.litespring.beans.factory.support.DefaultBeanFactory;
import org.litespring.context.ApplicationContext;

/**
 * Created by xusheng on 2019/1/3.
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    private String configFile;

    public ClassPathXmlApplicationContext(String configFile) {
        this.configFile = configFile;
    }

    @Override
    public Object getBean(String beanId) {
        DefaultBeanFactory beanFactory = new DefaultBeanFactory();
        beanFactory.loadBeanDefinition(configFile);
        return beanFactory.getBean(beanId);
    }
}
