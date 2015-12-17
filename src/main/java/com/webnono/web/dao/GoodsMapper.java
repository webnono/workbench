package com.webnono.web.dao;

import com.webnono.core.generic.GenericDao;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper extends GenericDao<Goods,Integer> {
    int countByExample(GoodsCriteria example);

    int deleteByExample(GoodsCriteria example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsCriteria example);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}