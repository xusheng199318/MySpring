package org.litespring.context;

/**
 * Created by xusheng on 2019/1/3.
 */
public interface ApplicationContext {
    Object getBean(String beanId);
}
