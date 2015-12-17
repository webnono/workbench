package com.webnono.web.dao;

import com.webnono.web.model.Resource;
import com.webnono.web.model.ResourceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {
    int countByExample(ResourceCriteria example);

    int deleteByExample(ResourceCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    List<Resource> selectByExample(ResourceCriteria example);

    Resource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceCriteria example);

    int updateByExample(@Param("record") Resource record, @Param("example") ResourceCriteria example);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}