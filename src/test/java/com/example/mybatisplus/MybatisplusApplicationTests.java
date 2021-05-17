package com.example.mybatisplus;

import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.UserMapper;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查找测试
     */
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    /**
     * 增加测试
     */
    @Test
    public void testInsert() {
        User user = new User();
//        自定义时为自定义，无自定义时为MP自定义
//        user.setId('12111');
        user.setName("1111");

        int result = userMapper.insert(user);
        System.out.println(result);
        System.out.println(user);

    }


    @Test
    public void testUpdate() {
        User user = new User();
        user.setId("1394125896104075265");
        user.setName("qqqq2222");
        int result = userMapper.updateById(user);
        System.out.println(result);
    }
}
