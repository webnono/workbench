package com.webnono.web.dao;

import com.webnono.web.model.Organization;
import com.webnono.web.model.OrganizationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    int countByExample(OrganizationCriteria example);

    int deleteByExample(OrganizationCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationCriteria example);

    Organization selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationCriteria example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationCriteria example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}