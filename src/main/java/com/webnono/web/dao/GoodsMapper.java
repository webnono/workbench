package com.webnono.web.dao;

import com.webnono.core.generic.GenericDao;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper extends GenericDao<Goods,Integer> {
    int countByExample(GoodsCriteria example);

    int deleteByExample(GoodsCriteria example);

    int insert(Goods record);

    List<Goods> selectByExample(GoodsCriteria example);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByPrimaryKey(Goods record);
}