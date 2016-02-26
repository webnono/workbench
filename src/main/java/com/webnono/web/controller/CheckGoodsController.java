package com.webnono.web.controller;

import com.webnono.core.Util.CheckUtil;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;
import com.webnono.web.service.GoodsService;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/2/25.
 */
@EnableScheduling
@Controller
public class CheckGoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String checkGoods(Model model) throws URISyntaxException{
        int count = 0;
        List<String> statusList = new ArrayList<String>();
        statusList.add("0");
        statusList.add("1");
        GoodsCriteria goodsCriteria = new GoodsCriteria();
        goodsCriteria.createCriteria().andGoodsStatusIn(statusList);
        List<Goods> goodsList = goodsService.getGoodsByCriteria(goodsCriteria);
        for(int i = 0; i < goodsList.size(); i++){
            Goods goods = goodsList.get(i);
            String encUrl = URLEncoder.encode(goods.getGoodsUrl());
            boolean isExist = CheckUtil.isExist(encUrl);
            if(!isExist){
                goods.setGoodsStatus("3");//设置状态
                goods.setGoodsDeleter((String) SecurityUtils.getSubject().getPrincipal());
                goods.setGoodsDeletetime(new Date());
                goodsService.update(goods);
                count++;
            }

        }
        model.addAttribute("totalCount", goodsList.size());
        model.addAttribute("handledCount", count);

        return "check";
    }
}
