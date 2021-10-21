package com.ybj.exception;

/**
 * @PACKAGE_NAME: com.ybj.exception
 * @NAME: NoSuchBeanDefinitionException 没有找到这样的bean抛出的异常
 * @AUTHOR: yaobojie
 * @DATE: 2021/10/21
 * @TIME: 17:48
 * @PURPOSE:
 * @PROJECT_NAME: spring
 **/
public class NoSuchBeanDefinitionException extends BeansException{

    private final String beanName;

//    private final ResolvableType resolvableType;

    public NoSuchBeanDefinitionException(String beanName) {
        this.beanName = beanName;
    }
}
