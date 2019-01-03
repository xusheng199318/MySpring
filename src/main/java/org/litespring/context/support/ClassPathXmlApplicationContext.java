package org.litespring.context.support;

import org.litespring.context.ApplicationContext;

/**
 * Created by xusheng on 2019/1/3.
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    public ClassPathXmlApplicationContext(String configFile) {
    }

    @Override
    public Object getBean(String beanId) {
        return null;
    }
}
