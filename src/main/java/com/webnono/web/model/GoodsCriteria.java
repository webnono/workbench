package com.webnono.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNull() {
            addCriterion("goods_cost is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIsNotNull() {
            addCriterion("goods_cost is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostEqualTo(BigDecimal value) {
            addCriterion("goods_cost =", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotEqualTo(BigDecimal value) {
            addCriterion("goods_cost <>", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThan(BigDecimal value) {
            addCriterion("goods_cost >", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_cost >=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThan(BigDecimal value) {
            addCriterion("goods_cost <", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_cost <=", value, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostIn(List<BigDecimal> values) {
            addCriterion("goods_cost in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotIn(List<BigDecimal> values) {
            addCriterion("goods_cost not in", values, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_cost between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_cost not between", value1, value2, "goodsCost");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceIsNull() {
            addCriterion("goods_tb_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceIsNotNull() {
            addCriterion("goods_tb_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceEqualTo(BigDecimal value) {
            addCriterion("goods_tb_price =", value, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_tb_price <>", value, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_tb_price >", value, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_tb_price >=", value, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceLessThan(BigDecimal value) {
            addCriterion("goods_tb_price <", value, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_tb_price <=", value, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceIn(List<BigDecimal> values) {
            addCriterion("goods_tb_price in", values, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_tb_price not in", values, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_tb_price between", value1, value2, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsTbPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_tb_price not between", value1, value2, "goodsTbPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeIsNull() {
            addCriterion("goods_uploadtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeIsNotNull() {
            addCriterion("goods_uploadtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeEqualTo(Date value) {
            addCriterion("goods_uploadtime =", value, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeNotEqualTo(Date value) {
            addCriterion("goods_uploadtime <>", value, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeGreaterThan(Date value) {
            addCriterion("goods_uploadtime >", value, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_uploadtime >=", value, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeLessThan(Date value) {
            addCriterion("goods_uploadtime <", value, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_uploadtime <=", value, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeIn(List<Date> values) {
            addCriterion("goods_uploadtime in", values, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeNotIn(List<Date> values) {
            addCriterion("goods_uploadtime not in", values, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeBetween(Date value1, Date value2) {
            addCriterion("goods_uploadtime between", value1, value2, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_uploadtime not between", value1, value2, "goodsUploadtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIsNull() {
            addCriterion("goods_addtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIsNotNull() {
            addCriterion("goods_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeEqualTo(Date value) {
            addCriterion("goods_addtime =", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotEqualTo(Date value) {
            addCriterion("goods_addtime <>", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeGreaterThan(Date value) {
            addCriterion("goods_addtime >", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_addtime >=", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeLessThan(Date value) {
            addCriterion("goods_addtime <", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_addtime <=", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIn(List<Date> values) {
            addCriterion("goods_addtime in", values, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotIn(List<Date> values) {
            addCriterion("goods_addtime not in", values, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeBetween(Date value1, Date value2) {
            addCriterion("goods_addtime between", value1, value2, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_addtime not between", value1, value2, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderIsNull() {
            addCriterion("goods_uploader is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderIsNotNull() {
            addCriterion("goods_uploader is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderEqualTo(String value) {
            addCriterion("goods_uploader =", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderNotEqualTo(String value) {
            addCriterion("goods_uploader <>", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderGreaterThan(String value) {
            addCriterion("goods_uploader >", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderGreaterThanOrEqualTo(String value) {
            addCriterion("goods_uploader >=", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderLessThan(String value) {
            addCriterion("goods_uploader <", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderLessThanOrEqualTo(String value) {
            addCriterion("goods_uploader <=", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderLike(String value) {
            addCriterion("goods_uploader like", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderNotLike(String value) {
            addCriterion("goods_uploader not like", value, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderIn(List<String> values) {
            addCriterion("goods_uploader in", values, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderNotIn(List<String> values) {
            addCriterion("goods_uploader not in", values, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderBetween(String value1, String value2) {
            addCriterion("goods_uploader between", value1, value2, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsUploaderNotBetween(String value1, String value2) {
            addCriterion("goods_uploader not between", value1, value2, "goodsUploader");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderIsNull() {
            addCriterion("goods_adder is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderIsNotNull() {
            addCriterion("goods_adder is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderEqualTo(String value) {
            addCriterion("goods_adder =", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderNotEqualTo(String value) {
            addCriterion("goods_adder <>", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderGreaterThan(String value) {
            addCriterion("goods_adder >", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderGreaterThanOrEqualTo(String value) {
            addCriterion("goods_adder >=", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderLessThan(String value) {
            addCriterion("goods_adder <", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderLessThanOrEqualTo(String value) {
            addCriterion("goods_adder <=", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderLike(String value) {
            addCriterion("goods_adder like", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderNotLike(String value) {
            addCriterion("goods_adder not like", value, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderIn(List<String> values) {
            addCriterion("goods_adder in", values, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderNotIn(List<String> values) {
            addCriterion("goods_adder not in", values, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderBetween(String value1, String value2) {
            addCriterion("goods_adder between", value1, value2, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsAdderNotBetween(String value1, String value2) {
            addCriterion("goods_adder not between", value1, value2, "goodsAdder");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(String value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(String value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(String value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(String value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLike(String value) {
            addCriterion("goods_status like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotLike(String value) {
            addCriterion("goods_status not like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<String> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<String> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(String value1, String value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeIsNull() {
            addCriterion("goods_deletetime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeIsNotNull() {
            addCriterion("goods_deletetime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeEqualTo(Date value) {
            addCriterion("goods_deletetime =", value, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeNotEqualTo(Date value) {
            addCriterion("goods_deletetime <>", value, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeGreaterThan(Date value) {
            addCriterion("goods_deletetime >", value, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_deletetime >=", value, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeLessThan(Date value) {
            addCriterion("goods_deletetime <", value, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_deletetime <=", value, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeIn(List<Date> values) {
            addCriterion("goods_deletetime in", values, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeNotIn(List<Date> values) {
            addCriterion("goods_deletetime not in", values, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeBetween(Date value1, Date value2) {
            addCriterion("goods_deletetime between", value1, value2, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_deletetime not between", value1, value2, "goodsDeletetime");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIsNull() {
            addCriterion("goods_category is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIsNotNull() {
            addCriterion("goods_category is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryEqualTo(String value) {
            addCriterion("goods_category =", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotEqualTo(String value) {
            addCriterion("goods_category <>", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThan(String value) {
            addCriterion("goods_category >", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("goods_category >=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThan(String value) {
            addCriterion("goods_category <", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLessThanOrEqualTo(String value) {
            addCriterion("goods_category <=", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryLike(String value) {
            addCriterion("goods_category like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotLike(String value) {
            addCriterion("goods_category not like", value, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIn(List<String> values) {
            addCriterion("goods_category in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotIn(List<String> values) {
            addCriterion("goods_category not in", values, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryBetween(String value1, String value2) {
            addCriterion("goods_category between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNotBetween(String value1, String value2) {
            addCriterion("goods_category not between", value1, value2, "goodsCategory");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIsNull() {
            addCriterion("goods_url is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIsNotNull() {
            addCriterion("goods_url is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlEqualTo(String value) {
            addCriterion("goods_url =", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotEqualTo(String value) {
            addCriterion("goods_url <>", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlGreaterThan(String value) {
            addCriterion("goods_url >", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_url >=", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLessThan(String value) {
            addCriterion("goods_url <", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLessThanOrEqualTo(String value) {
            addCriterion("goods_url <=", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlLike(String value) {
            addCriterion("goods_url like", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotLike(String value) {
            addCriterion("goods_url not like", value, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlIn(List<String> values) {
            addCriterion("goods_url in", values, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotIn(List<String> values) {
            addCriterion("goods_url not in", values, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlBetween(String value1, String value2) {
            addCriterion("goods_url between", value1, value2, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlNotBetween(String value1, String value2) {
            addCriterion("goods_url not between", value1, value2, "goodsUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterIsNull() {
            addCriterion("goods_deleter is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterIsNotNull() {
            addCriterion("goods_deleter is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterEqualTo(String value) {
            addCriterion("goods_deleter =", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterNotEqualTo(String value) {
            addCriterion("goods_deleter <>", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterGreaterThan(String value) {
            addCriterion("goods_deleter >", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterGreaterThanOrEqualTo(String value) {
            addCriterion("goods_deleter >=", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterLessThan(String value) {
            addCriterion("goods_deleter <", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterLessThanOrEqualTo(String value) {
            addCriterion("goods_deleter <=", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterLike(String value) {
            addCriterion("goods_deleter like", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterNotLike(String value) {
            addCriterion("goods_deleter not like", value, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterIn(List<String> values) {
            addCriterion("goods_deleter in", values, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterNotIn(List<String> values) {
            addCriterion("goods_deleter not in", values, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterBetween(String value1, String value2) {
            addCriterion("goods_deleter between", value1, value2, "goodsDeleter");
            return (Criteria) this;
        }

        public Criteria andGoodsDeleterNotBetween(String value1, String value2) {
            addCriterion("goods_deleter not between", value1, value2, "goodsDeleter");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}