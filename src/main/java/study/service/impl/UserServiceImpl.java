package study.service.impl;

import lombok.extern.slf4j.Slf4j;
import study.dao.UserMapper;
import study.model.User;
import study.service.UserService;

import javax.annotation.Resource;

@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User findUserById(String userId) {
        log.info("findUserById的参数{}",userId);
        return userMapper.selectById(userId);
    }
}
