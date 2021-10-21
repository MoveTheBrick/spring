package com.ybj.core;

/**
 * @PACKAGE_NAME: com.ybj.core
 * @NAME: AliasRegistry 别名注册
 * @AUTHOR: yaobojie
 * @DATE: 2021/10/21
 * @TIME: 14:02
 * @PURPOSE:
 * @PROJECT_NAME: spring
 **/
public interface AliasRegistry {

    // 注册别名
    void registerAlias(String name, String alias);

    // 移除别名
    void removeAlias(String alias);

    // 是否是别名
    boolean isAlias(String name);

    // 获取别名
    String[] getAliases(String name);
}
