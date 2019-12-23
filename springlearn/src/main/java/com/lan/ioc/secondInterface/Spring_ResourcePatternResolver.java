package com.lan.ioc.secondInterface;

import com.lan.ioc.topInterface.Spring_ResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */
public interface Spring_ResourcePatternResolver extends Spring_ResourceLoader {

    String ClassPath_ALL_URL_PREFIX = "classpath*:";

    Resource[] getReources(String locationPattern) throws IOException;
}
