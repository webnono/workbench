package com.webnono.web.service;

import com.webnono.core.generic.GenericService;
import com.webnono.web.model.Role;

import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
public interface RoleService extends GenericService<Role,Long> {

    List<String> selectRolesById(String roleIds);

    List<String> selectPermissions(String roleIds);
}
