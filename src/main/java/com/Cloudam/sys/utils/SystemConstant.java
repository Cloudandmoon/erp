package com.Cloudam.sys.utils;

/**
 * @Author: Cloudam
 * @Description:
 * @Date:14:11星期六
 */
public interface SystemConstant {
    /**
     * 当前用户登录的Key
     */
    String LOGINUSER = "loginuser";
    JSONResult LOGIN_SUCCESS = new JSONResult(true,"登陆成功");
    JSONResult LOGIN_ERROR_PASS = new JSONResult(false,"登陆失败,");

    /**
     * 类型为菜单：用于首页左侧导航栏
     */
    String TYPE_MENU = "menu";

    /**
     * 类型为权限
     */
    String TYPE_PERMISSION ="permission" ;

    /**
     * 菜单是否展开，1展开
     */
    Integer OPEN_TRUE = 1;

    /**
     * 菜单是否展开，0不展开
     */
    Integer OPEN_FALSE = 0;

    /**
     * 角色为超级管理员
     */
    Integer SUPERUSER = 0;

    /**
     * 登录操作
     */
    String LOGIN_ACTION = "登录操作";

    /**
     * 注销操作
     */
    String LOGOUT_ACTION = "注销操作";
    /**
     * 查询操作
     */
    String SEARCH_ACTION = "查询操作";
    /**
     * 更新操作
     */
    String UPDATE_ACTION = "更新操作";
    /**
     * 添加操作
     */
    String ADD_ACTION = "登录操作";
    /**
     * 删除操作
     */
    String DELETE_ACTION = "登录操作";


    /**
     * 删除成功
     */
    JSONResult DELETE_SUCCESS = new JSONResult(true,"删除成功");
    /**
     * 删除失败
     */
    JSONResult DELETE_ERROR = new JSONResult(false,"删除失败");
    /**
     * 添加成功
     */
    JSONResult ADD_SUCCESS = new JSONResult(true,"添加成功");
    /**
     * 添加失败
     */
    JSONResult ADD_ERROR = new JSONResult(false,"添加失败");
    /**
     * 修改成功
     */
    JSONResult UPDATE_SUCCESS = new JSONResult(true,"修改成功");
    /**
     * 修改失败
     */
    JSONResult UPDATE_ERROR = new JSONResult(false,"修改失败");


}
