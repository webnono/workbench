package com.webnono.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private BigDecimal goodsCost;

    private BigDecimal goodsTbPrice;

    private Date goodsUploadtime;

    private Date goodsAddtime;

    private String goodsUploader;

    private String goodsAdder;

    private Boolean goodsStatus;

    private Date goodsDeletetime;

    private String goodsCategory;

    private String goodsUrl;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsCost() {
        return goodsCost;
    }

    public void setGoodsCost(BigDecimal goodsCost) {
        this.goodsCost = goodsCost;
    }

    public BigDecimal getGoodsTbPrice() {
        return goodsTbPrice;
    }

    public void setGoodsTbPrice(BigDecimal goodsTbPrice) {
        this.goodsTbPrice = goodsTbPrice;
    }

    public Date getGoodsUploadtime() {
        return goodsUploadtime;
    }

    public void setGoodsUploadtime(Date goodsUploadtime) {
        this.goodsUploadtime = goodsUploadtime;
    }

    public Date getGoodsAddtime() {
        return goodsAddtime;
    }

    public void setGoodsAddtime(Date goodsAddtime) {
        this.goodsAddtime = goodsAddtime;
    }

    public String getGoodsUploader() {
        return goodsUploader;
    }

    public void setGoodsUploader(String goodsUploader) {
        this.goodsUploader = goodsUploader == null ? null : goodsUploader.trim();
    }

    public String getGoodsAdder() {
        return goodsAdder;
    }

    public void setGoodsAdder(String goodsAdder) {
        this.goodsAdder = goodsAdder == null ? null : goodsAdder.trim();
    }

    public Boolean getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Boolean goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Date getGoodsDeletetime() {
        return goodsDeletetime;
    }

    public void setGoodsDeletetime(Date goodsDeletetime) {
        this.goodsDeletetime = goodsDeletetime;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory == null ? null : goodsCategory.trim();
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl == null ? null : goodsUrl.trim();
    }
}