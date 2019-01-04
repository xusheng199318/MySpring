package org.litespring.beans;

/**
 * Created by xusheng on 2019/1/3.
 */
public interface BeanDefinition {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";
    String SCOPE_DEFAULT = "";

    /**
     * 是否单例
     * @return
     */
    boolean isSingleton();

    /**
     * 是否多例
     * @return
     */
    boolean isPrototype();

    /**
     * 获取Bean的作用域
     * @return
     */
    String getScope();

    /**
     * 设置Bean的作用域
     * @param scope
     */
    void setScope(String scope);

    /**
     * 获取Bean的全路径名
     * @return
     */
    String getBeanClassName();
}
