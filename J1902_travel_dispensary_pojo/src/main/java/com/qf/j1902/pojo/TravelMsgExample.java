package com.qf.j1902.pojo;

import java.util.ArrayList;
import java.util.List;

public class TravelMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelMsgExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNull() {
            addCriterion("commodity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIsNotNull() {
            addCriterion("commodity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEqualTo(String value) {
            addCriterion("commodity =", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotEqualTo(String value) {
            addCriterion("commodity <>", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThan(String value) {
            addCriterion("commodity >", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityGreaterThanOrEqualTo(String value) {
            addCriterion("commodity >=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThan(String value) {
            addCriterion("commodity <", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLessThanOrEqualTo(String value) {
            addCriterion("commodity <=", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityLike(String value) {
            addCriterion("commodity like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotLike(String value) {
            addCriterion("commodity not like", value, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityIn(List<String> values) {
            addCriterion("commodity in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotIn(List<String> values) {
            addCriterion("commodity not in", values, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityBetween(String value1, String value2) {
            addCriterion("commodity between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityNotBetween(String value1, String value2) {
            addCriterion("commodity not between", value1, value2, "commodity");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationIsNull() {
            addCriterion("commodity_information is null");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationIsNotNull() {
            addCriterion("commodity_information is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationEqualTo(String value) {
            addCriterion("commodity_information =", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationNotEqualTo(String value) {
            addCriterion("commodity_information <>", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationGreaterThan(String value) {
            addCriterion("commodity_information >", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_information >=", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationLessThan(String value) {
            addCriterion("commodity_information <", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationLessThanOrEqualTo(String value) {
            addCriterion("commodity_information <=", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationLike(String value) {
            addCriterion("commodity_information like", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationNotLike(String value) {
            addCriterion("commodity_information not like", value, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationIn(List<String> values) {
            addCriterion("commodity_information in", values, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationNotIn(List<String> values) {
            addCriterion("commodity_information not in", values, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationBetween(String value1, String value2) {
            addCriterion("commodity_information between", value1, value2, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andCommodityInformationNotBetween(String value1, String value2) {
            addCriterion("commodity_information not between", value1, value2, "commodityInformation");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andBusinessmenIsNull() {
            addCriterion("businessmen is null");
            return (Criteria) this;
        }

        public Criteria andBusinessmenIsNotNull() {
            addCriterion("businessmen is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessmenEqualTo(String value) {
            addCriterion("businessmen =", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenNotEqualTo(String value) {
            addCriterion("businessmen <>", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenGreaterThan(String value) {
            addCriterion("businessmen >", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenGreaterThanOrEqualTo(String value) {
            addCriterion("businessmen >=", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenLessThan(String value) {
            addCriterion("businessmen <", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenLessThanOrEqualTo(String value) {
            addCriterion("businessmen <=", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenLike(String value) {
            addCriterion("businessmen like", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenNotLike(String value) {
            addCriterion("businessmen not like", value, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenIn(List<String> values) {
            addCriterion("businessmen in", values, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenNotIn(List<String> values) {
            addCriterion("businessmen not in", values, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenBetween(String value1, String value2) {
            addCriterion("businessmen between", value1, value2, "businessmen");
            return (Criteria) this;
        }

        public Criteria andBusinessmenNotBetween(String value1, String value2) {
            addCriterion("businessmen not between", value1, value2, "businessmen");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneIsNull() {
            addCriterion("advisory_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneIsNotNull() {
            addCriterion("advisory_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneEqualTo(String value) {
            addCriterion("advisory_telephone =", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneNotEqualTo(String value) {
            addCriterion("advisory_telephone <>", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneGreaterThan(String value) {
            addCriterion("advisory_telephone >", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("advisory_telephone >=", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneLessThan(String value) {
            addCriterion("advisory_telephone <", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneLessThanOrEqualTo(String value) {
            addCriterion("advisory_telephone <=", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneLike(String value) {
            addCriterion("advisory_telephone like", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneNotLike(String value) {
            addCriterion("advisory_telephone not like", value, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneIn(List<String> values) {
            addCriterion("advisory_telephone in", values, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneNotIn(List<String> values) {
            addCriterion("advisory_telephone not in", values, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneBetween(String value1, String value2) {
            addCriterion("advisory_telephone between", value1, value2, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAdvisoryTelephoneNotBetween(String value1, String value2) {
            addCriterion("advisory_telephone not between", value1, value2, "advisoryTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andLocalIsNull() {
            addCriterion("local is null");
            return (Criteria) this;
        }

        public Criteria andLocalIsNotNull() {
            addCriterion("local is not null");
            return (Criteria) this;
        }

        public Criteria andLocalEqualTo(String value) {
            addCriterion("local =", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotEqualTo(String value) {
            addCriterion("local <>", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalGreaterThan(String value) {
            addCriterion("local >", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalGreaterThanOrEqualTo(String value) {
            addCriterion("local >=", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLessThan(String value) {
            addCriterion("local <", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLessThanOrEqualTo(String value) {
            addCriterion("local <=", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalLike(String value) {
            addCriterion("local like", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotLike(String value) {
            addCriterion("local not like", value, "local");
            return (Criteria) this;
        }

        public Criteria andLocalIn(List<String> values) {
            addCriterion("local in", values, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotIn(List<String> values) {
            addCriterion("local not in", values, "local");
            return (Criteria) this;
        }

        public Criteria andLocalBetween(String value1, String value2) {
            addCriterion("local between", value1, value2, "local");
            return (Criteria) this;
        }

        public Criteria andLocalNotBetween(String value1, String value2) {
            addCriterion("local not between", value1, value2, "local");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIsNull() {
            addCriterion("miaoshu is null");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIsNotNull() {
            addCriterion("miaoshu is not null");
            return (Criteria) this;
        }

        public Criteria andMiaoshuEqualTo(String value) {
            addCriterion("miaoshu =", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotEqualTo(String value) {
            addCriterion("miaoshu <>", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuGreaterThan(String value) {
            addCriterion("miaoshu >", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("miaoshu >=", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLessThan(String value) {
            addCriterion("miaoshu <", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLessThanOrEqualTo(String value) {
            addCriterion("miaoshu <=", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLike(String value) {
            addCriterion("miaoshu like", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotLike(String value) {
            addCriterion("miaoshu not like", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIn(List<String> values) {
            addCriterion("miaoshu in", values, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotIn(List<String> values) {
            addCriterion("miaoshu not in", values, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuBetween(String value1, String value2) {
            addCriterion("miaoshu between", value1, value2, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotBetween(String value1, String value2) {
            addCriterion("miaoshu not between", value1, value2, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andTicketsIsNull() {
            addCriterion("tickets is null");
            return (Criteria) this;
        }

        public Criteria andTicketsIsNotNull() {
            addCriterion("tickets is not null");
            return (Criteria) this;
        }

        public Criteria andTicketsEqualTo(String value) {
            addCriterion("tickets =", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotEqualTo(String value) {
            addCriterion("tickets <>", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsGreaterThan(String value) {
            addCriterion("tickets >", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsGreaterThanOrEqualTo(String value) {
            addCriterion("tickets >=", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsLessThan(String value) {
            addCriterion("tickets <", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsLessThanOrEqualTo(String value) {
            addCriterion("tickets <=", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsLike(String value) {
            addCriterion("tickets like", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotLike(String value) {
            addCriterion("tickets not like", value, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsIn(List<String> values) {
            addCriterion("tickets in", values, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotIn(List<String> values) {
            addCriterion("tickets not in", values, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsBetween(String value1, String value2) {
            addCriterion("tickets between", value1, value2, "tickets");
            return (Criteria) this;
        }

        public Criteria andTicketsNotBetween(String value1, String value2) {
            addCriterion("tickets not between", value1, value2, "tickets");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
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