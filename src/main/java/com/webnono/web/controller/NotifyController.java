package com.webnono.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2015/12/26.
 */
@Controller
public class NotifyController {
    @RequestMapping(value = "addShop",method = {RequestMethod.GET,RequestMethod.POST})
    public void doRecieve(@RequestParam(value = "shopName",required = false) String shopName,
                          @RequestParam(value = "userName",required = false) String userName,
                          @RequestParam(value = "userPwd",required = false) String userPwd,
                          @RequestParam(value = "shopArea",required = false) String shopArea,
                          @RequestParam(value = "shopType",required = false) String shopType,
                          @RequestParam(value = "shopTrade",required = false) String shopTrade,
                          @RequestParam(value = "shopAddress",required = false) String shopAddress,
                          @RequestParam(value = "shopTel",required = false) String shopTel,
                          @RequestParam(value = "jszxCreditsRate",required = false) String jszxCreditsRate,
                          @RequestParam(value = "appid",required = false) String appid,
                          @RequestParam(value = "jszxId",required = false) String jszxId,
                          @RequestParam(value = "jszxStatus",required = false) String jszxStatus,
                          @RequestParam(value = "merchantDiscount",required = false) String merchantDiscount,
                          @RequestParam(value = "merchantDescription",required = false) String merchantDescription,
                          @RequestParam(value = "MerchantMobileNo",required = false) String MerchantMobileNo,
                          @RequestParam(value = "shopHour",required = false) String shopHour,
                          @RequestParam(value = "merchantTag",required = false) String merchantTag,
                          @RequestParam(value = "wechatMerchantId",required = false) String wechatMerchantId,
                          @RequestParam(value = "orgVerifySeq",required = false) String orgVerifySeq,
                          @RequestParam(value = "merchantImageFront",required = false) String merchantImageFront,
                          @RequestParam(value = "merchantImageIn",required = false) String merchantImageIn,
                          @RequestParam(value = "merchantImageProduct",required = false) String merchantImageProduct
                          ){

        System.out.println(shopName);
        System.out.println(userName);
        System.out.println(shopArea);
        System.out.println(userPwd);
        System.out.println(shopType);
        System.out.println(shopAddress);
        System.out.println(shopTel);
        System.out.println(jszxCreditsRate);
        System.out.println(appid);
        System.out.println(jszxId);
        System.out.println(merchantDiscount);
        System.out.println("商家标签:"+merchantTag);
        System.out.println(merchantImageFront);
        System.out.println(merchantDescription);
        System.out.println(merchantDiscount);
        System.out.println(merchantImageProduct);
        System.out.println(merchantImageIn);
        System.out.println(orgVerifySeq);

    }
}
