/*
{*****************************************************************************
{  设备管理 v1.0													
{  版权信息 (c) 2005-2016 郭旭辉——詹晓锋. 保留所有权利.
{  创建人：  郭旭辉
{  审查人：
{  模块：系统用户基础信息（模拟表）											
{  功能描述:										
{															
{  ---------------------------------------------------------------------------	
{  维护历史:													
{  日期        维护人        维护类型						
{  ---------------------------------------------------------------------------	
{  2016-06-21  郭旭辉        新建	
{ 	                                                                     
{*****************************************************************************
*/

package cn.gdpu.his.service.user;

import cn.gdpu.common.domain.BaseDomain;
import cn.gdpu.common.service.IPageService;
import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.domain.user.User;
import cn.gdpu.his.service.IHISBaseService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 《系统用户基础信息（模拟表）》 业务逻辑服务接口
 *
 * @author 郭旭辉
 */
public interface IUserService<D extends IHISBaseDAO<T>, T extends BaseDomain> extends IHISBaseService<D, T>, IPageService<D, T> {

    /**
     * 用户登录校验
     *
     * @param username 用户名
     * @param password 密码
     * @param session  账号
     * @param response 响应
     * @return 返回，用户实体
     */
    User isLogin(String username, String password, HttpSession session, HttpServletResponse response);
}