package org.litespring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xusheng on 2019/1/3.
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
    String getDescription();
}
