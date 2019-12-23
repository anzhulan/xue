package com.lan.ioc.topInterface;

import org.springframework.core.io.Resource;

/**
 *资源文件获取最顶层接口
 * @author lanxinping
 * @Date 2019-12-20
 */
public interface Spring_ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String var1);

    ClassLoader getClassLoader();
}
