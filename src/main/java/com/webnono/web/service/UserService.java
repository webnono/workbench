package com.webnono.web.service;

import com.webnono.core.generic.GenericService;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.web.model.User;

import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
public interface UserService extends GenericService<User,Long> {

    User selectByUsername(String username);

    List<String> selectRoles(String username);

    List<String> selectPermissions(String username);


}
