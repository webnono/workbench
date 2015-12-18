package com.webnono.web.controller;

import com.webnono.core.pagehelper.PageModel;
import com.webnono.core.pagehelper.PageQueryModel;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;
import com.webnono.web.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/12/18.
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;
    @RequestMapping(value = "/list")
    public String goodsList(PageQueryModel pageQueryModel,Model model){
        GoodsCriteria criteria = new GoodsCriteria();
        PageModel<Goods> goodsPageModel = goodsService.getGoodsByCriteria(pageQueryModel,criteria);
        model.addAttribute("pageData",goodsPageModel);
        return "goodsList";
    }


}
