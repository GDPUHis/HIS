package cn.gdpu.common.utils.User;


import cn.gdpu.common.domain.AccountDto;
import cn.gdpu.common.exception.BizException;
import cn.gdpu.common.system.filter.HISRequestFilter;
import cn.gdpu.common.utils.ERRORCODE;
import cn.gdpu.common.utils.http.HttpUtils;
import cn.gdpu.his.domain.user.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 郭旭辉 on 2016/3/21.
 * 用户上下文
 */
public class UserContext {



    /**
     * 更新当前用户
     * @return
     */
    public static AccountDto refreshUser(){
        return null;
    }

    /**
     * 获取当前用户
     * @return 返回 AccountDto
     */
    public static AccountDto getCurrentUser(){
        HttpServletRequest request = HISRequestFilter.getRequest();
        //获取access_token
        Cookie cookie = HttpUtils.getCookie(request.getCookies(),HttpUtils.ACCESS_TOKEN);
        if (cookie != null){
            String token = cookie.getValue();
            User user = (User) request.getSession().getAttribute(token);
            if (user != null){
                return setAccount(user);
            }else {
                throw new BizException(ERRORCODE.ILLEGAL_LOGIN.getCode(), ERRORCODE.ILLEGAL_LOGIN.getMessage());
            }
        }else {
            throw new BizException(ERRORCODE.ILLEGAL_LOGIN.getCode(), ERRORCODE.ILLEGAL_LOGIN.getMessage());
        }

    }

    /**
     * 设置当前用户
     * @param user
     */
//    public static void setCurrentUser(AccountDto user){
//        //缓存记录
//        context.set(user);
//    }

    /**
     * 移除当前用户
     */
//    public static void removeCurrentUser(){
//        context.remove();
//    }

    private static AccountDto setAccount(User user){
        AccountDto accountDto = new AccountDto();
        accountDto.setUid(user.getCode());
        accountDto.setUsername(user.getUsername());
        accountDto.setDepartmentId(user.getDepartmentId());
        accountDto.setName(user.getName());
        accountDto.setPositionId(user.getPositionId());
        accountDto.setJobNumber(user.getJobNumber());
        return accountDto;
    }
}
