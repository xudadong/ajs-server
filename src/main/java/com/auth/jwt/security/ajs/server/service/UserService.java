package com.auth.jwt.security.ajs.server.service;

import com.auth.jwt.security.ajs.server.model.User;
import com.github.pagehelper.PageInfo;

/**
 * @Description TODO
 * @Author xudd
 * @Date 2018/8/13 0013 下午 4:25
 */
public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
