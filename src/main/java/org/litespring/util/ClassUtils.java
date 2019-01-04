package org.litespring.util;

/**
 * Created by xusheng on 2019/1/3.
 */
public abstract class ClassUtils {
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Exception e) {
            //不能获取类加载器
        }

        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
            if (cl == null) {
                try {
                    cl = ClassLoader.getSystemClassLoader();
                } catch (Exception e) {
                    //无法获取类加载器
                }
            }
        }
        return cl;
    }
}
