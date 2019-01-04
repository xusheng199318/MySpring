package org.litespring.beans.factory.support;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.litespring.beans.BeanDefinition;
import org.litespring.beans.factory.BeanFactory;
import org.litespring.util.ClassUtils;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xusheng on 2019/1/3.
 */
public class DefaultBeanFactory implements BeanFactory {


    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(64);



    @Override
    public Object getBean(String beanId) {
        BeanDefinition bd = beanDefinitionMap.get(beanId);
        if (bd == null) {
            return null;
        }

        if (bd.isSingleton()) {
            Object bean = "";
            if (bean == null) {
                bean = createBean(bd);
            }
        }
        return createBean(bd);
    }

    private Object createBean(BeanDefinition bd) {
        String beanClassName = bd.getBeanClassName();
        try {
            ClassLoader cl = ClassUtils.getDefaultClassLoader();
            Class<?> clz = cl.loadClass(beanClassName);
            return clz.newInstance();

        } catch (Exception e) {
            throw new RuntimeException("create bean for " + beanClassName + "fail");
        }
    }
}
