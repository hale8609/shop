package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    /**
     * device
     */
    protected String orderByClause;

    /**
     * device
     */
    protected boolean distinct;

    /**
     * device
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public DeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-03-26
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * device 2018-03-26
     */
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

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIsNull() {
            addCriterion("device_address is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIsNotNull() {
            addCriterion("device_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressEqualTo(String value) {
            addCriterion("device_address =", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotEqualTo(String value) {
            addCriterion("device_address <>", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressGreaterThan(String value) {
            addCriterion("device_address >", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("device_address >=", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLessThan(String value) {
            addCriterion("device_address <", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLessThanOrEqualTo(String value) {
            addCriterion("device_address <=", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressLike(String value) {
            addCriterion("device_address like", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotLike(String value) {
            addCriterion("device_address not like", value, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressIn(List<String> values) {
            addCriterion("device_address in", values, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotIn(List<String> values) {
            addCriterion("device_address not in", values, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressBetween(String value1, String value2) {
            addCriterion("device_address between", value1, value2, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceAddressNotBetween(String value1, String value2) {
            addCriterion("device_address not between", value1, value2, "deviceAddress");
            return (Criteria) this;
        }

        public Criteria andDeviceLngIsNull() {
            addCriterion("device_lng is null");
            return (Criteria) this;
        }

        public Criteria andDeviceLngIsNotNull() {
            addCriterion("device_lng is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceLngEqualTo(String value) {
            addCriterion("device_lng =", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngNotEqualTo(String value) {
            addCriterion("device_lng <>", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngGreaterThan(String value) {
            addCriterion("device_lng >", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngGreaterThanOrEqualTo(String value) {
            addCriterion("device_lng >=", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngLessThan(String value) {
            addCriterion("device_lng <", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngLessThanOrEqualTo(String value) {
            addCriterion("device_lng <=", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngLike(String value) {
            addCriterion("device_lng like", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngNotLike(String value) {
            addCriterion("device_lng not like", value, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngIn(List<String> values) {
            addCriterion("device_lng in", values, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngNotIn(List<String> values) {
            addCriterion("device_lng not in", values, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngBetween(String value1, String value2) {
            addCriterion("device_lng between", value1, value2, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLngNotBetween(String value1, String value2) {
            addCriterion("device_lng not between", value1, value2, "deviceLng");
            return (Criteria) this;
        }

        public Criteria andDeviceLatIsNull() {
            addCriterion("device_lat is null");
            return (Criteria) this;
        }

        public Criteria andDeviceLatIsNotNull() {
            addCriterion("device_lat is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceLatEqualTo(String value) {
            addCriterion("device_lat =", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatNotEqualTo(String value) {
            addCriterion("device_lat <>", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatGreaterThan(String value) {
            addCriterion("device_lat >", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatGreaterThanOrEqualTo(String value) {
            addCriterion("device_lat >=", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatLessThan(String value) {
            addCriterion("device_lat <", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatLessThanOrEqualTo(String value) {
            addCriterion("device_lat <=", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatLike(String value) {
            addCriterion("device_lat like", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatNotLike(String value) {
            addCriterion("device_lat not like", value, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatIn(List<String> values) {
            addCriterion("device_lat in", values, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatNotIn(List<String> values) {
            addCriterion("device_lat not in", values, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatBetween(String value1, String value2) {
            addCriterion("device_lat between", value1, value2, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andDeviceLatNotBetween(String value1, String value2) {
            addCriterion("device_lat not between", value1, value2, "deviceLat");
            return (Criteria) this;
        }

        public Criteria andProduceDateIsNull() {
            addCriterion("produce_date is null");
            return (Criteria) this;
        }

        public Criteria andProduceDateIsNotNull() {
            addCriterion("produce_date is not null");
            return (Criteria) this;
        }

        public Criteria andProduceDateEqualTo(Date value) {
            addCriterion("produce_date =", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotEqualTo(Date value) {
            addCriterion("produce_date <>", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThan(Date value) {
            addCriterion("produce_date >", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("produce_date >=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThan(Date value) {
            addCriterion("produce_date <", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateLessThanOrEqualTo(Date value) {
            addCriterion("produce_date <=", value, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateIn(List<Date> values) {
            addCriterion("produce_date in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotIn(List<Date> values) {
            addCriterion("produce_date not in", values, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateBetween(Date value1, Date value2) {
            addCriterion("produce_date between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andProduceDateNotBetween(Date value1, Date value2) {
            addCriterion("produce_date not between", value1, value2, "produceDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("use_date is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("use_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(Date value) {
            addCriterion("use_date =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(Date value) {
            addCriterion("use_date <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(Date value) {
            addCriterion("use_date >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("use_date >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(Date value) {
            addCriterion("use_date <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(Date value) {
            addCriterion("use_date <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<Date> values) {
            addCriterion("use_date in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<Date> values) {
            addCriterion("use_date not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(Date value1, Date value2) {
            addCriterion("use_date between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(Date value1, Date value2) {
            addCriterion("use_date not between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }
    }

    /**
     * device
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * device 2018-03-26
     */
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