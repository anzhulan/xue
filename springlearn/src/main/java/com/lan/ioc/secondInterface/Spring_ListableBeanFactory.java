package com.lan.ioc.secondInterface;

import com.lan.ioc.topInterface.Spring_BeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.core.ResolvableType;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */
public interface Spring_ListableBeanFactory extends Spring_BeanFactory{

    boolean containsBeanDefinition(String beanName);

    /**
     * 返回定义Bean的总数量
     * @return
     */
    int getBeanDefinitionCount();

    /**
     * 返回定义Bean的名字
     * @return
     */
    String[] getBeanDefinitionNames();

    String[] getBeanNamesForType(ResolvableType type);

    String[] getBeanNamesForType(Class<?> type);

    String[] getBeanNamesForType(Class<?> type,boolean includeNodeSingletons,boolean allowEagerInit);

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingletons, boolean allowEagerInit)
            throws BeansException;

    String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType) ;

    Map<String,Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType) throws BeansException;

    <A extends Annotation> A findAnnotationOnBean(String beanName) throws NoSuchBeanDefinitionException;
}
