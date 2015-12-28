package com.webnono.web.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.webnono.core.annotation.CurrentUser;
import com.webnono.core.pagehelper.PageModel;
import com.webnono.core.pagehelper.PageQueryModel;
import com.webnono.web.model.Goods;
import com.webnono.web.model.GoodsCriteria;
import com.webnono.web.model.User;
import com.webnono.web.service.GoodsService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015/12/18.
 */
@Controller
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;
    @RequestMapping(value = "/list")
    public String goodsList(@RequestParam(value = "goodsUploader", required = false) String goodsUploader,
                            @RequestParam(value = "goodsName", required = false) String goodsName,
                            PageQueryModel pageQueryModel, Model model){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("0");
        GoodsCriteria criteria = new GoodsCriteria();
        if ((!"".equals(goodsName) && goodsUploader != null) && (!"".equals(goodsUploader) && goodsUploader != null)){
            criteria.createCriteria().andGoodsStatusIn(list).andGoodsUploaderEqualTo(goodsUploader).andGoodsNameLike("%" + goodsName + "%");
            model.addAttribute("nameGoods",goodsName);
            model.addAttribute("uploader",goodsUploader);
            System.out.println("商品名称:"+goodsName);
        } else if(!"".equals(goodsUploader) && goodsUploader != null){
            criteria.createCriteria().andGoodsStatusIn(list).andGoodsUploaderEqualTo(goodsUploader);
            System.out.println("商品上传人:"+goodsUploader);
            model.addAttribute("uploader",goodsUploader);
        } else if (!"".equals(goodsName) && goodsUploader != null){
            criteria.createCriteria().andGoodsStatusIn(list).andGoodsNameLike("%"+goodsName+"%");
            model.addAttribute("nameGoods",goodsName);
            System.out.println("商品名称:"+goodsName);
        }else {
            criteria.createCriteria().andGoodsStatusIn(list);
        }

        criteria.setOrderByClause("goods_id desc");


        PageModel<Goods> goodsPageModel = goodsService.getGoodsByCriteria(pageQueryModel,criteria);
        model.addAttribute("pageData",goodsPageModel);
        return "goodsList";
    }

    @RequestMapping(value = "/claim")
    public String doClaim(@RequestParam("goodsUploader") String goodsUploader,
                          @RequestParam("goodsId") int goodsId,
                          @RequestParam("pageNo") int pageNo,Model model){
        Goods goods = goodsService.selectById(goodsId);
        if (goods != null){
            if(("0").equals(goods.getGoodsStatus())){//如果该商品未上传
                goods.setGoodsUploader(goodsUploader);
                goods.setGoodsUploadtime(new Date());
                goods.setGoodsStatus("1");
                goodsService.update(goods);
                return "redirect:/goods/list?pageNo="+pageNo;
            }else {
                System.out.println("该商品已经上传过了");
                model.addAttribute("error","该商品已经上传过了");
                return "redirect:/goods/list?pageNo="+pageNo;
            }
        }else {
            System.out.println("该商品不存在");
            model.addAttribute("error","该商品不存在");
            return "redirect:/goods/list?pageNo="+pageNo;
        }

    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String saveView(Model model){
        model.addAttribute("goods",new Goods());
        return "goodsAdd";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String doSave(@Valid Goods goods,BindingResult bindingResult,Model model){
        Subject subject = SecurityUtils.getSubject();
        if (bindingResult.hasErrors()) return "goodsAdd";
        goods.setGoodsStatus("0");//商品状态为未上传
        goods.setGoodsAddtime(new Date());
        goods.setGoodsAdder((String)subject.getPrincipal());
        goodsService.insert(goods);
        return "redirect:/goods/list";
    }

    @RequestMapping(value = "/delete")
    public String deDelete(@RequestParam("goodsId") Integer[] goodsIds,
                           @RequestParam("pageNo") int pageNo,
                           Model model){
        Subject subject = SecurityUtils.getSubject();
        GoodsCriteria criteria = new GoodsCriteria();
        criteria.createCriteria().andGoodsIdIn(Arrays.asList(goodsIds));
        List<Goods> goodsList = goodsService.getGoodsByCriteria(criteria);
        if (goodsList.size() != goodsIds.length){
            model.addAttribute("error","商品删除错误");
            return "redirect:/goods/list?pageNo="+pageNo;
        }else{
            for (Goods goods : goodsList){
                goods.setGoodsStatus("3");//设置状态
                goods.setGoodsDeleter((String)subject.getPrincipal());
                goods.setGoodsDeletetime(new Date());
                goodsService.update(goods);
            }
            return "redirect:/goods/list?pageNo="+pageNo;
        }

    }

    @RequestMapping(value = "/recycle",method = RequestMethod.GET)
    public String goodsRecycle(@RequestParam(value = "goodsUploader", required = false) String goodsUploader,
                               @RequestParam(value = "goodsName", required = false) String goodsName,
                               PageQueryModel pageQueryModel,Model model){
        GoodsCriteria criteria = new GoodsCriteria();
        if ((!"".equals(goodsName) && goodsUploader != null) && (!"".equals(goodsUploader) && goodsUploader != null)){
            criteria.createCriteria().andGoodsStatusEqualTo("3").andGoodsUploaderEqualTo(goodsUploader).andGoodsNameLike("%" + goodsName + "%");
            model.addAttribute("nameGoods",goodsName);
            model.addAttribute("uploader",goodsUploader);
            System.out.println("商品名称:"+goodsName);
        } else if(!"".equals(goodsUploader) && goodsUploader != null){
            criteria.createCriteria().andGoodsStatusEqualTo("3").andGoodsUploaderEqualTo(goodsUploader);
            System.out.println("商品上传人:"+goodsUploader);
            model.addAttribute("uploader",goodsUploader);
        } else if (!"".equals(goodsName) && goodsUploader != null){
            criteria.createCriteria().andGoodsStatusEqualTo("3").andGoodsNameLike("%"+goodsName+"%");
            model.addAttribute("nameGoods",goodsName);
            System.out.println("商品名称:"+goodsName);
        }else {
            criteria.createCriteria().andGoodsStatusEqualTo("3");
        }
        criteria.setOrderByClause("goods_id desc");
        PageModel<Goods> goodsPageModel = goodsService.getGoodsByCriteria(pageQueryModel,criteria);
        model.addAttribute("pageData",goodsPageModel);
        return "goodsRecycle";
    }

    @RequestMapping(value = "/revertDelete" ,method = RequestMethod.POST)
    public String doRevertDelete(@RequestParam("goodsId") Integer[] goodsIds,
                                 @RequestParam("pageNo") int pageNo,Model model){

        GoodsCriteria criteria = new GoodsCriteria();
        criteria.createCriteria().andGoodsIdIn(Arrays.asList(goodsIds));
        List<Goods> goodsList = goodsService.getGoodsByCriteria(criteria);
        if (goodsList.size() != goodsIds.length){
            model.addAttribute("error","商品撤销删除错误");
            return "redirect:/goods/recycle?pageNo="+pageNo;
        }else{
            for (Goods goods : goodsList){
                if("".equals(goods.getGoodsUploader())) {
                    goods.setGoodsStatus("0");//设置状态为1,表示已经上传
                }else {
                    goods.setGoodsStatus("1");
                }
                goods.setGoodsDeletetime(null);//重置删除相关信息
                goods.setGoodsDeleter("");
                goodsService.update(goods);
            }
            return "redirect:/goods/recycle?pageNo="+pageNo;
        }

    }




}
