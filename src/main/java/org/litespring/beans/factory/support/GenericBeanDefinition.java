package org.litespring.beans.factory.support;

import org.litespring.beans.BeanDefinition;

import static org.litespring.beans.BeanDefinition.SCOPE_DEFAULT;
import static org.litespring.beans.BeanDefinition.SCOPE_PROTOTYPE;
import static org.litespring.beans.BeanDefinition.SCOPE_SINGLETON;

/**
 * Created by xusheng on 2019/1/3.
 */
public class GenericBeanDefinition implements BeanDefinition{
    private String id;
    private String beanClassName;
    private boolean singleton = true;
    private boolean prototype = false;
    private String scope = SCOPE_DEFAULT;

    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope) || SCOPE_DEFAULT.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public boolean isSingleton() {
        return singleton;
    }

    public boolean isPrototype() {
        return prototype;
    }

    public String getScope() {
        return scope;
    }
}

