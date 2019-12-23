package com.lan.ioc.topInterface;

import org.springframework.context.ApplicationEvent;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */
public interface Spring_ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);

    void publishEvent(Object event);
}
