package com.webnono.web.dao;

import com.webnono.core.generic.GenericDao;
import com.webnono.web.model.Resource;
import com.webnono.web.model.ResourceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceMapper extends GenericDao<Resource,Long> {
    int countByExample(ResourceCriteria example);

    int deleteByExample(ResourceCriteria example);

    int insert(Resource record);

    List<Resource> selectByExample(ResourceCriteria example);

    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceCriteria example);

    int updateByExample(@Param("record") Resource record, @Param("example") ResourceCriteria example);

    int updateByPrimaryKey(Resource record);
}