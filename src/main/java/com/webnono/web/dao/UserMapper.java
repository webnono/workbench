package com.webnono.web.dao;

import com.webnono.core.generic.GenericDao;
import com.webnono.web.model.User;
import com.webnono.web.model.UserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends GenericDao<User,Long> {
    int countByExample(UserCriteria example);

    int deleteByExample(UserCriteria example);

    int insert(User record);

    List<User> selectByExample(UserCriteria example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByPrimaryKey(User record);

    List<User> selectByExample(RowBounds rowBounds,UserCriteria criteria);
}