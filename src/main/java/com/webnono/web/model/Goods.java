package com.webnono.web.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer goodsId;

    @NotEmpty(message = "填个名字赛")
    private String goodsName;
    @NotNull(message = "成本价不填亏了莫找我")
    @Min(value = 0,message = "送我两件赛")
    @Max(value = 240000000, message = "好多钱哦")
    private BigDecimal goodsCost;

    private BigDecimal goodsTbPrice;

    private Date goodsUploadtime;

    private Date goodsAddtime;

    private String goodsUploader;

    private String goodsAdder;

    private String goodsStatus;

    private Date goodsDeletetime;

    private String goodsCategory;
    @NotEmpty
    private String goodsUrl;

    private String goodsDeleter;

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

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus == null ? null : goodsStatus.trim();
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

    public String getGoodsDeleter() {
        return goodsDeleter;
    }

    public void setGoodsDeleter(String goodsDeleter) {
        this.goodsDeleter = goodsDeleter == null ? null : goodsDeleter.trim();
    }
}