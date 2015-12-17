package com.webnono.web.service.impl;

import com.webnono.core.generic.GenericDao;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.web.dao.UserMapper;
import com.webnono.web.model.User;
import com.webnono.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/12/17.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User,Long> implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }
}
