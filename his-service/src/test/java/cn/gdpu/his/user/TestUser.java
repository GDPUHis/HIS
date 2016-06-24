package cn.gdpu.his.user;

import cn.gdpu.common.utils.MD5Utils;
import cn.gdpu.his.domain.user.User;
import cn.gdpu.his.service.user.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Created by 郭旭辉 on 2016/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-service.xml"})
public class TestUser {
    @Autowired
    private IUserService userService;

    @Test
    public void testUUID(){
        System.out.println(UUID.randomUUID()  );
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setCode(UUID.randomUUID().toString());
        user.setUsername("13527101797");
        user.setPassword(MD5Utils.getMD5("123123"));
        user.setName("Nicos");
        user.setJobNumber("88888888");
        user.setPositionId(1);
        user.setDepartmentId(1);
        user.setCreator("Admin");
        user.setCreateDate(System.currentTimeMillis());
        user.setStatus(0);
        userService.insert(user);
    }
}
