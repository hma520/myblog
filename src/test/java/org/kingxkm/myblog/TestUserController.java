package org.kingxkm.myblog;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kingxkm.common.testUtil.RandomData;
import org.kingxkm.myblog.entity.User;
import org.kingxkm.myblog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2014/9/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestUserController {
    final static Logger logger = LoggerFactory.getLogger(TestUserController.class);

    @Autowired
    private UserService userService;

    @Before
    public void init ()

    {

        System.out.println("Test数据初始化......");
        for (int i = 1; i <= 10; i++) {
            User u = new User();
            u.setUsername(RandomData.randomName("用户"));
            u.setPassword(RandomData.randomName("PWD"));
            System.out.println(JSON.toJSONString(userService.addUser(u)));
        }
        System.out.println("Test数据初始化完成.");
    }

    @Test
    public void deleteUser() {
        // 正常删除用户.
        System.out.println(JSON.toJSONString(userService.getAllUser()));
        userService.deleteUser(2L);
        System.out.println("删除成功\n"+JSON.toJSONString(userService.getAllUser()));
    }


    @Test
    public void getUserTest() {

        System.out.println("查询结果：" + JSON.toJSON(userService.getUser(3l)));

    }


    @Test
    public void getAllUserTest() {

        System.out.println("查询结果：" + userService.getAllUser());

    }


    @Test
    public void tJSON() {
        logger.info("tJSON method开始");
        System.out.println("tJSON method开始");
        User u = new User();
        u.setUsername(RandomData.randomName("1用户"));
        u.setPassword(RandomData.randomName("1PWD"));
        String uj = JSON.toJSONString(u);
        System.out.println(uj);
    }
}
