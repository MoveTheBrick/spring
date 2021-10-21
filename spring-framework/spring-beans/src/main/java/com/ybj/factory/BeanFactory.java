package com.ybj.factory;

import com.ybj.exception.BeansException;
import com.ybj.exception.NoSuchBeanDefinitionException;

/**
 * @PACKAGE_NAME: com.ybj.factory
 * @NAME: BeanFactory
 * @AUTHOR: yaobojie
 * @DATE: 2021/10/21
 * @TIME: 14:10
 * @PURPOSE:
 * @PROJECT_NAME: spring
 **/
public interface BeanFactory {

    String FACTORY_BEAN_PREFIX = "&";

    // 通过beanName获取
    Object getBean(String name) throws BeansException;
    // 通过必要的beanType和beanName获取
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
    //
    Object getBean(String name, Object... args) throws BeansException;
    // 通过type获取
    <T> T getBean(Class<T> requiredType) throws BeansException;
//
//    <T> T getBean(Class<T> requiredType, Object... args) throws BeansException;
//
//    <T> ObjectProvider<T> getBeanProvider(Class<T> requiredType);
//
//    <T> ObjectProvider<T> getBeanProvider(ResolvableType requiredType);
    // 容器中是否包含该bean
    boolean containsBean(String name);
//
    boolean isSingleton(String name) throws NoSuchBeanDefinitionException;
//
//    boolean isPrototype(String name) throws NoSuchBeanDefinitionException;
//
//    boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException;
//
//    boolean isTypeMatch(String name, Class<?> typeToMatch) throws NoSuchBeanDefinitionException;
//
//    Class<?> getType(String name) throws NoSuchBeanDefinitionException;

    String[] getAliases(String name);
}
