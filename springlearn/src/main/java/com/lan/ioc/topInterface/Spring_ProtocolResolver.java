package com.lan.ioc.topInterface;

import org.springframework.core.io.Resource;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */
public interface Spring_ProtocolResolver {

    Resource resolve(String location,Spring_ResourceLoader resourceLoader);
}
