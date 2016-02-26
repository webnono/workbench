package com.webnono.web.service.impl;

import com.webnono.core.generic.GenericDao;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.core.pagehelper.IPageQueryModel;
import com.webnono.core.pagehelper.PageModel;
import com.webnono.web.dao.UserMapper;
import com.webnono.web.model.Goods;
import com.webnono.web.model.User;
import com.webnono.web.model.UserCriteria;
import com.webnono.web.service.RoleService;
import com.webnono.web.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User,Long> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleService roleService;
    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserCriteria userCriteria = new UserCriteria();
        userCriteria.createCriteria().andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userCriteria);
        if (!userList.isEmpty())return userList.get(0);
        return null;
    }

    @Override
    public List<String> selectRoles(String username) {
        User user = this.selectByUsername(username);
        if (user != null){
            String roleIds = user.getRoleIds();
           return roleService.selectRolesById(roleIds);
        }else {
            return Collections.emptyList();
        }

    }

    @Override
    public List<String> selectPermissions(String username) {
        User user = selectByUsername(username);
        if (user == null){
            return Collections.EMPTY_LIST;
        }
       return roleService.selectPermissions(user.getRoleIds());
    }

    @Override
    public PageModel<User> getUserByCriteria(IPageQueryModel pageQueryModel, UserCriteria criteria) {
        RowBounds rowBounds = new RowBounds(pageQueryModel.getStart(),pageQueryModel.getLimit());
        List<User> goodsList = userMapper.selectByExample(rowBounds,criteria);
        int count = userMapper.countByExample(criteria);
        PageModel pageModel = new PageModel(count,goodsList,pageQueryModel);
        return pageModel;
    }
}
