package com.webnono.web.service.impl;

import com.webnono.core.generic.GenericDao;
import com.webnono.core.generic.GenericServiceImpl;
import com.webnono.web.dao.GoodsMapper;
import com.webnono.web.model.Goods;
import com.webnono.web.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
