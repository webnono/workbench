package com.webnono.core.Util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.net.URLEncoder;

/**
 * Created by Administrator on 2016/2/25.
 */
public class CheckUtil {


    public static boolean isExist(String encUrl){

        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            //用get方法发送http请求
            String url = "http://yl.jfbxfyl.cn/index.php?mod=app&act=goods&url=" + encUrl + "&callback=?";
            HttpGet get = new HttpGet(url);
            System.out.println("执行get请求:...."+get.getURI());
            CloseableHttpResponse httpResponse = null;
            //发送get请求
            httpResponse = httpClient.execute(get);
            try{
                //response实体
                HttpEntity entity = httpResponse.getEntity();
                String responseBody = EntityUtils.toString(entity);
                if (null != responseBody && responseBody.length() > 50){//50表示没有返回我们所需要的商品内容
                    System.out.println("响应状态码:"+ httpResponse.getStatusLine());
                    System.out.println("-------------------------------------------------");
                    System.out.println("响应内容:" + responseBody);
                    System.out.println("-------------------------------------------------");
                    System.out.println("响应内容长度:" + responseBody.length());
                    return true;
                }else {
                    return false;
                }
            } finally{
                httpResponse.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
