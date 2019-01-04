package org.litespring.beans.factory;

/**
 * Created by xusheng on 2019/1/3.
 */
public interface BeanFactory {
    Object getBean(String beanId);
}
