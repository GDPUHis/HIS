package cn.gdpu.his.controller.user;

import cn.gdpu.his.domain.user.User;
import cn.gdpu.his.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by 郭旭辉 on 2016/6/23.
 * 用户管理控制类
 */
@Controller
@RequestMapping(value = "/his/admin/user")
public class UserController {
    @Autowired
    private IUserService userService;


    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @param session   session
     * @param response  响应流
     * @return 返回，userBean
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User isLogin(String username, String password, HttpSession session, HttpServletResponse response) {
        return userService.isLogin(username, password, session, response);
    }
}
