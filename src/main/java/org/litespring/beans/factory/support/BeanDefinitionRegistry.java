package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

/**
 * Created by xusheng on 2019/1/3.
 */
public interface BeanDefinitionRegistry {
    void registryBeanDefinition(String beanId, BeanDefinition bd);
    BeanDefinition getBeanDefinition(String beanId);
}
