package com.lan.ioc.secondInterface;

import com.lan.ioc.topInterface.Spring_BeanFactory;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */
public interface Spring_HierarchicalBeanFactory extends Spring_BeanFactory{

    /**
     * 获得父工厂
     * @return
     */
    Spring_BeanFactory getParentBeanFactory();

    boolean containsLocalBean(String name);

}
