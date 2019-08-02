package com.qf.j1902.entity;

import java.util.ArrayList;
import java.util.List;

public class UserinfoTicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoTicketExample() {
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

        public Criteria andUserinfoIdIsNull() {
            addCriterion("userinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("userinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Integer value) {
            addCriterion("userinfo_id =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Integer value) {
            addCriterion("userinfo_id <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Integer value) {
            addCriterion("userinfo_id >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Integer value) {
            addCriterion("userinfo_id <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Integer> values) {
            addCriterion("userinfo_id in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Integer> values) {
            addCriterion("userinfo_id not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id not between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIsNull() {
            addCriterion("userinfo_name is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIsNotNull() {
            addCriterion("userinfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameEqualTo(String value) {
            addCriterion("userinfo_name =", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotEqualTo(String value) {
            addCriterion("userinfo_name <>", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameGreaterThan(String value) {
            addCriterion("userinfo_name >", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_name >=", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLessThan(String value) {
            addCriterion("userinfo_name <", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLessThanOrEqualTo(String value) {
            addCriterion("userinfo_name <=", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameLike(String value) {
            addCriterion("userinfo_name like", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotLike(String value) {
            addCriterion("userinfo_name not like", value, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameIn(List<String> values) {
            addCriterion("userinfo_name in", values, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotIn(List<String> values) {
            addCriterion("userinfo_name not in", values, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameBetween(String value1, String value2) {
            addCriterion("userinfo_name between", value1, value2, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoNameNotBetween(String value1, String value2) {
            addCriterion("userinfo_name not between", value1, value2, "userinfoName");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardIsNull() {
            addCriterion("userinfo_Idcard is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardIsNotNull() {
            addCriterion("userinfo_Idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardEqualTo(String value) {
            addCriterion("userinfo_Idcard =", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardNotEqualTo(String value) {
            addCriterion("userinfo_Idcard <>", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardGreaterThan(String value) {
            addCriterion("userinfo_Idcard >", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_Idcard >=", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardLessThan(String value) {
            addCriterion("userinfo_Idcard <", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardLessThanOrEqualTo(String value) {
            addCriterion("userinfo_Idcard <=", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardLike(String value) {
            addCriterion("userinfo_Idcard like", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardNotLike(String value) {
            addCriterion("userinfo_Idcard not like", value, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardIn(List<String> values) {
            addCriterion("userinfo_Idcard in", values, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardNotIn(List<String> values) {
            addCriterion("userinfo_Idcard not in", values, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardBetween(String value1, String value2) {
            addCriterion("userinfo_Idcard between", value1, value2, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdcardNotBetween(String value1, String value2) {
            addCriterion("userinfo_Idcard not between", value1, value2, "userinfoIdcard");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellIsNull() {
            addCriterion("userinfo_tell is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellIsNotNull() {
            addCriterion("userinfo_tell is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellEqualTo(String value) {
            addCriterion("userinfo_tell =", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellNotEqualTo(String value) {
            addCriterion("userinfo_tell <>", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellGreaterThan(String value) {
            addCriterion("userinfo_tell >", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_tell >=", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellLessThan(String value) {
            addCriterion("userinfo_tell <", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellLessThanOrEqualTo(String value) {
            addCriterion("userinfo_tell <=", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellLike(String value) {
            addCriterion("userinfo_tell like", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellNotLike(String value) {
            addCriterion("userinfo_tell not like", value, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellIn(List<String> values) {
            addCriterion("userinfo_tell in", values, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellNotIn(List<String> values) {
            addCriterion("userinfo_tell not in", values, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellBetween(String value1, String value2) {
            addCriterion("userinfo_tell between", value1, value2, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoTellNotBetween(String value1, String value2) {
            addCriterion("userinfo_tell not between", value1, value2, "userinfoTell");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderIsNull() {
            addCriterion("userinfo_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderIsNotNull() {
            addCriterion("userinfo_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderEqualTo(String value) {
            addCriterion("userinfo_gender =", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderNotEqualTo(String value) {
            addCriterion("userinfo_gender <>", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderGreaterThan(String value) {
            addCriterion("userinfo_gender >", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_gender >=", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderLessThan(String value) {
            addCriterion("userinfo_gender <", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderLessThanOrEqualTo(String value) {
            addCriterion("userinfo_gender <=", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderLike(String value) {
            addCriterion("userinfo_gender like", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderNotLike(String value) {
            addCriterion("userinfo_gender not like", value, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderIn(List<String> values) {
            addCriterion("userinfo_gender in", values, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderNotIn(List<String> values) {
            addCriterion("userinfo_gender not in", values, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderBetween(String value1, String value2) {
            addCriterion("userinfo_gender between", value1, value2, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoGenderNotBetween(String value1, String value2) {
            addCriterion("userinfo_gender not between", value1, value2, "userinfoGender");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeIsNull() {
            addCriterion("userinfo_age is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeIsNotNull() {
            addCriterion("userinfo_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeEqualTo(Integer value) {
            addCriterion("userinfo_age =", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeNotEqualTo(Integer value) {
            addCriterion("userinfo_age <>", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeGreaterThan(Integer value) {
            addCriterion("userinfo_age >", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfo_age >=", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeLessThan(Integer value) {
            addCriterion("userinfo_age <", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeLessThanOrEqualTo(Integer value) {
            addCriterion("userinfo_age <=", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeIn(List<Integer> values) {
            addCriterion("userinfo_age in", values, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeNotIn(List<Integer> values) {
            addCriterion("userinfo_age not in", values, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_age between", value1, value2, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_age not between", value1, value2, "userinfoAge");
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