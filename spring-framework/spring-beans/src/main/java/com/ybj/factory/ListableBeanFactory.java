package com.ybj.factory;

/**
 * @PACKAGE_NAME: com.ybj.factory
 * @NAME: ListableBeanFactory
 * @AUTHOR: yaobojie
 * @DATE: 2021/10/21
 * @TIME: 17:43
 * @PURPOSE:
 * @PROJECT_NAME: spring
 **/
public interface ListableBeanFactory extends BeanFactory{

    // 是否包含此bean
    boolean containsBeanDefinition(String beanName);
    // 获取bd数量
    int getBeanDefinitionCount();
}
