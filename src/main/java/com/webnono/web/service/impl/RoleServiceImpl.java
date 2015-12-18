package com.webnono.web.service.impl;

import com.webnono.core.generic.GenericDao;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.web.dao.RoleMapper;
import com.webnono.web.model.Resource;
import com.webnono.web.model.Role;
import com.webnono.web.service.ResourceService;
import com.webnono.web.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role,Long> implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    ResourceService resourceService;

    @Override
    public List<String> selectRolesById(String roleIds) {
        List<String> roles = new ArrayList<String>();
        for (String roleId : roleIds.split(",")){
            Role role = roleMapper.selectByPrimaryKey(Long.valueOf(roleId));
            if (role != null){
                roles.add(role.getRole());
            }
        }
        return roles;
    }

    @Override
    public List<String> selectPermissions(String roleIds) {
        List<String> permissions = new ArrayList<String>();
        for (String roleId : roleIds.split(",")){
            Role role = roleMapper.selectByPrimaryKey(Long.valueOf(roleId));
            if (role != null){
                for (String resoureId : role.getResourceIds().split(",")){
                    Resource resource = resourceService.selectById(Long.valueOf(resoureId));
                    if (resource != null){
                        permissions.add(resource.getPermission());
                    }
                }
            }
        }
        return permissions;
    }

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }
}
