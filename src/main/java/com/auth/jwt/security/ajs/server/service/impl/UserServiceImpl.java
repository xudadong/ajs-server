package com.auth.jwt.security.ajs.server.service.impl;

import com.auth.jwt.security.ajs.server.mapper.UserMapper;
import com.auth.jwt.security.ajs.server.model.User;
import com.auth.jwt.security.ajs.server.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author xudd
 * @Date 2018/8/13 0013 下午 4:26
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(User user) {

        return userMapper.insert(user);
    }

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userMapper.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
}
