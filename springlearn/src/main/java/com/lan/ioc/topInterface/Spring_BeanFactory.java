package com.lan.ioc.topInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.core.ResolvableType;

/**
 * Bean工厂最顶层接口
 * @author lanxinping
 * @Date 2019-12-20
 */
public interface Spring_BeanFactory {
    String FACTORY_BEAN_PREFIX = "&";

    Object getBean(String name) throws BeansException;

    <T> T getBean(String name,Class<T> requiredType) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType,Object... args) throws BeansException;

    /**
     * 是否包含
     * @param name
     * @return
     */
    boolean containBean(String name);

    /**
     * 是否是单例,
     * @param name
     * @return
     * @throws NoSuchBeanDefinitionException
     */
    boolean isSingleton(String name) throws NoSuchBeanDefinitionException;

    /**
     * 是否原型
     * @param name
     * @return
     * @throws NoSuchBeanDefinitionException
     */
    boolean isPrototype(String name) throws NoSuchBeanDefinitionException;

    boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException;

    /**
     * 检查给定名称的类是否与给定的类型相同
     * @param name
     * @param typeToMatch
     * @return
     * @throws NoSuchBeanDefinitionException
     */
    boolean isTypeMacth(String name,Class<?> typeToMatch) throws NoSuchBeanDefinitionException;

    /**
     * 返回给定名称类的类型
     * @param name
     * @return
     * @throws NoSuchBeanDefinitionException
     */
    Class<?> getType(String name) throws NoSuchBeanDefinitionException;

    /**
     * 返回别名的集合
     * @param name
     * @return
     */
    String[] getAliases(String name);

}
