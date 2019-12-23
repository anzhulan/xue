package com.lan.ioc.secondInterface;

import com.lan.ioc.topInterface.Spring_ResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.util.ClassUtils;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */
public class Spring_DefaultResourceLoader implements Spring_ResourceLoader{

    private ClassLoader classLoader;

    public Spring_DefaultResourceLoader() {
        this.classLoader = ClassUtils.getDefaultClassLoader();
    }
    public Spring_DefaultResourceLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }


    @Override
    public Resource getResource(String var1) {
        return null;
    }

    @Override
    public ClassLoader getClassLoader() {
        return this.classLoader != null ? this.classLoader : ClassUtils.getDefaultClassLoader();
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void addProtocolResolver() {

    }
}
