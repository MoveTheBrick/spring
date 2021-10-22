package com.ybj.factory.config;

import com.ybj.core.AttributeAccessor;
import com.ybj.factory.BeanMetadataElement;

/**
 * @PACKAGE_NAME: com.ybj.factory.config
 * @NAME: BeanDefinition
 * @AUTHOR: yaobojie
 * @DATE: 2021/10/21
 * @TIME: 17:57
 * @PURPOSE:
 * @PROJECT_NAME: spring
 **/
public interface BeanDefinition extends AttributeAccessor, BeanMetadataElement {

    void setParentName(String parentName);

    String getParentName();

    void setBeanClassName(String beanClassName);

    String getBeanClassName();

    void setScope(String scope);

    String getScope();

    void setLazyInit(boolean lazyInit);

    boolean isLazyInit();

    void setDependsOn(String... dependsOn);

    String[] getDependsOn();

    void setAutowireCandidate(boolean autowireCandidate);

    boolean isAutowireCandidate();

    void setPrimary(boolean primary);

    boolean isPrimary();

    void setFactoryBeanName(String factoryBeanName);

    String getFactoryBeanName();

    void setFactoryMethodName(String factoryMethodName);

    String getFactoryMethodName();

//    ConstructorArgumentValues getConstructorArgumentValues();
//
//    default boolean hasConstructorArgumentValues() {
//        return !getConstructorArgumentValues().isEmpty();
//    }
//
//    MutablePropertyValues getPropertyValues();
//
//    default boolean hasPropertyValues() {
//        return !getPropertyValues().isEmpty();
//    }

    void setInitMethodName(String initMethodName);

    String getInitMethodName();

    void setDestroyMethodName(String destroyMethodName);

    String getDestroyMethodName();

    void setRole(int role);

    int getRole();

    void setDescription(String description);

    String getDescription();

    boolean isSingleton();

    boolean isPrototype();

    boolean isAbstract();

    String getResourceDescription();

    BeanDefinition getOriginatingBeanDefinition();
}
