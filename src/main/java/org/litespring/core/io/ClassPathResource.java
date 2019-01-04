package org.litespring.core.io;

import org.litespring.util.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xusheng on 2019/1/3.
 */
public class ClassPathResource implements Resource {
    /**
     * 配置文件路径
     */
    private String configFilePath;

    private ClassLoader classLoader;


    @Override
    public InputStream getInputStream() throws IOException {
        InputStream resourceStream = classLoader.getResourceAsStream(configFilePath);

        if (resourceStream == null) {
            throw new FileNotFoundException(configFilePath + " cannot be opened");
        }
        return resourceStream;
    }

    @Override
    public String getDescription() {
        return configFilePath;
    }

    public ClassPathResource(String configFilePath) {
        this(configFilePath, null);
    }

    public ClassPathResource(String configFilePath, ClassLoader classLoader) {
        this.configFilePath = configFilePath;
        this.classLoader = (classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader());
    }
}
