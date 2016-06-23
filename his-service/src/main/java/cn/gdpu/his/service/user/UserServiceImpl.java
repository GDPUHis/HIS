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

import cn.gdpu.common.exception.BizException;
import cn.gdpu.common.utils.ERRORCODE;
import cn.gdpu.common.utils.MD5Utils;
import cn.gdpu.common.utils.http.HttpUtils;
import cn.gdpu.his.dao.IHISBaseDAO;
import cn.gdpu.his.dao.user.IUserDAO;
import cn.gdpu.his.domain.user.User;
import cn.gdpu.his.param.user.UserParam;
import cn.gdpu.his.service.AbstractHISPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 《系统用户基础信息（模拟表）》 业务逻辑服务类
 * @author 郭旭辉
 *
 */
@Service("UserServiceImpl")
public class UserServiceImpl extends AbstractHISPageService<IHISBaseDAO<User>, User> implements IUserService<IHISBaseDAO<User>,User>{
    @Autowired
    private IUserDAO userDAO;

    @Override
    public IHISBaseDAO<User> getDao() {
        return userDAO;
    }

    @Override
    public User isLogin(String username, String password, HttpSession session, HttpServletResponse response) {
        User user = findOne(UserParam.F_Username, username);
        if (user == null) {
            throw new BizException(ERRORCODE.ACCOUNT_ILLEGAL.getCode(), ERRORCODE.ACCOUNT_ILLEGAL.getMessage());
        } else if (user.getPassword().equalsIgnoreCase(MD5Utils.getMD5(password))) {
            //验证通过
            String token = MD5Utils.getToken(username, password);
            //设置session
            HttpUtils.generalUserSession(session, user, token, 2 * 60 * 60);
            //设置cookie
            HttpUtils.setCookie(response, token, 2 * 60 * 60);
            //设置缓存
//            UserContext.initUser();
            return user;
        } else {
            //登录验证未通过，自动转化为系统异常
            throw new RuntimeException();
        }
    }
}