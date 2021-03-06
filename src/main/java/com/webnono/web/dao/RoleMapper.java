package com.webnono.web.dao;

import com.webnono.core.generic.GenericDao;
import com.webnono.web.model.Role;
import com.webnono.web.model.RoleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends GenericDao<Role,Long>{
    int countByExample(RoleCriteria example);

    int deleteByExample(RoleCriteria example);

    int insert(Role record);

    List<Role> selectByExample(RoleCriteria example);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleCriteria example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleCriteria example);

    int updateByPrimaryKey(Role record);
}