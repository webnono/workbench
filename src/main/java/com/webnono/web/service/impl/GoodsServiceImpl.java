package com.webnono.web.service.impl;

import com.webnono.core.generic.GenericDao;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.core.pagehelper.IPageQueryModel;
import com.webnono.core.pagehelper.PageModel;
import com.webnono.web.dao.GoodsMapper;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;
import com.webnono.web.service.GoodsService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
@Service
public class GoodsServiceImpl extends GenericServiceImpl<Goods,Integer> implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public GenericDao<Goods, Integer> getDao() {
        return goodsMapper;
    }

    @Override
    public PageModel<Goods> getGoodsByCriteria(IPageQueryModel pageQueryModel, GoodsCriteria criteria) {
        RowBounds rowBounds = new RowBounds(pageQueryModel.getStart(),pageQueryModel.getLimit());
        List<Goods> goodsList = goodsMapper.selectByExample(rowBounds,criteria);
        int count = goodsMapper.countByExample(criteria);
        PageModel pageModel = new PageModel(count,goodsList,pageQueryModel);
        return pageModel;
    }

    @Override
    public List<Goods> getGoodsByCriteria(GoodsCriteria criteria) {
        return goodsMapper.selectByExample(criteria);
    }

    @Override
    public void deleteBatch(GoodsCriteria criteria) {

    }
}
