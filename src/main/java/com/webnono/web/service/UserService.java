package com.webnono.web.service;

import com.webnono.core.generic.GenericService;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.core.pagehelper.IPageQueryModel;
import com.webnono.core.pagehelper.PageModel;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;
import com.webnono.web.model.User;
import com.webnono.web.model.UserCriteria;

import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
public interface UserService extends GenericService<User,Long> {

    User selectByUsername(String username);

    List<String> selectRoles(String username);

    List<String> selectPermissions(String username);

    PageModel<User> getUserByCriteria(IPageQueryModel pageQueryModel,UserCriteria criteria);


}
