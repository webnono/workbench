package com.webnono.web.service;

import com.webnono.core.generic.GenericService;
import com.webnono.core.pagehelper.IPageQueryModel;
import com.webnono.core.pagehelper.PageModel;
import com.webnono.web.controller.GoodsController;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;

import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
public interface GoodsService extends GenericService<Goods,Integer> {

    PageModel<Goods> getGoodsByCriteria(IPageQueryModel pageQueryModel,GoodsCriteria criteria);

    List<Goods> getGoodsByCriteria(GoodsCriteria criteria);

    void deleteBatch(GoodsCriteria criteria);
}
