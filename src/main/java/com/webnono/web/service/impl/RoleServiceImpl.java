package com.webnono.web.service.impl;

import com.webnono.core.generic.GenericDao;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.web.dao.RoleMapper;
import com.webnono.web.model.Role;
import com.webnono.web.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/12/17.
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role,Long> implements RoleService {

    @Autowired
    RoleMapper roleMapper;
    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }
}
