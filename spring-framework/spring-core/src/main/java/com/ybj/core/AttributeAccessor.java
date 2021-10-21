package com.ybj.core;

/**
 * @PACKAGE_NAME: com.ybj.core
 * @NAME: AttributeAccessor 获取类中的属性
 * @AUTHOR: yaobojie
 * @DATE: 2021/10/21
 * @TIME: 18:00
 * @PURPOSE:
 * @PROJECT_NAME: spring
 **/
public interface AttributeAccessor {

    void setAttribute(String name, Object value);

    Object getAttribute(String name);

    Object removeAttribute(String name);

    boolean hasAttribute(String name);

    String[] attributeNames();
}
