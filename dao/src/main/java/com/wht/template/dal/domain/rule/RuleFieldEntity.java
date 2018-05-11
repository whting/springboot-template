package com.wht.template.dal.domain.rule;

import com.wht.template.core.tkmybatis.IEntity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rule_field")
public class RuleFieldEntity extends IEntity {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String uuid;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 0为系统字段 1为扩展字段
     */
    private Boolean sign;

    /**
     * partner表partner_code
     */
    @Column(name = "partner_code")
    private String partnerCode;

    /**
     * application表的name
     */
    @Column(name = "app_name")
    private String appName;

    private String name;

    @Column(name = "display_name")
    private String displayName;

    private String type;

    @Column(name = "max_length")
    private Short maxLength;

    /**
     * 字段是否必填  1 为必须 0 为非
     */
    private Boolean necessary;

    /**
     * 是否在规则条件左变量展示  “N”不展示，“Y”展示
     */
    @Column(name = "sign_for_rule")
    private String signForRule;

    /**
     * 是否作为velocity的属性  “N”不，“Y”是
     */
    @Column(name = "sign_for_velocity")
    private String signForVelocity;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;

    private String description;

    @Column(name = "app_type")
    private String appType;

    @Column(name = "sign_for_saas")
    private String signForSaas;

    @Column(name = "saas_name")
    private String saasName;

    @Column(name = "enum_values")
    private String enumValues;

    @Column(name = "sys_default")
    private String sysDefault;

    @Column(name = "main_property")
    private String mainProperty;

    private String code;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取0为系统字段 1为扩展字段
     *
     * @return sign - 0为系统字段 1为扩展字段
     */
    public Boolean getSign() {
        return sign;
    }

    /**
     * 设置0为系统字段 1为扩展字段
     *
     * @param sign 0为系统字段 1为扩展字段
     */
    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    /**
     * 获取partner表partner_code
     *
     * @return partner_code - partner表partner_code
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * 设置partner表partner_code
     *
     * @param partnerCode partner表partner_code
     */
    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    /**
     * 获取application表的name
     *
     * @return app_name - application表的name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置application表的name
     *
     * @param appName application表的name
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return display_name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return max_length
     */
    public Short getMaxLength() {
        return maxLength;
    }

    /**
     * @param maxLength
     */
    public void setMaxLength(Short maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * 获取字段是否必填  1 为必须 0 为非
     *
     * @return necessary - 字段是否必填  1 为必须 0 为非
     */
    public Boolean getNecessary() {
        return necessary;
    }

    /**
     * 设置字段是否必填  1 为必须 0 为非
     *
     * @param necessary 字段是否必填  1 为必须 0 为非
     */
    public void setNecessary(Boolean necessary) {
        this.necessary = necessary;
    }

    /**
     * 获取是否在规则条件左变量展示  “N”不展示，“Y”展示
     *
     * @return sign_for_rule - 是否在规则条件左变量展示  “N”不展示，“Y”展示
     */
    public String getSignForRule() {
        return signForRule;
    }

    /**
     * 设置是否在规则条件左变量展示  “N”不展示，“Y”展示
     *
     * @param signForRule 是否在规则条件左变量展示  “N”不展示，“Y”展示
     */
    public void setSignForRule(String signForRule) {
        this.signForRule = signForRule;
    }

    /**
     * 获取是否作为velocity的属性  “N”不，“Y”是
     *
     * @return sign_for_velocity - 是否作为velocity的属性  “N”不，“Y”是
     */
    public String getSignForVelocity() {
        return signForVelocity;
    }

    /**
     * 设置是否作为velocity的属性  “N”不，“Y”是
     *
     * @param signForVelocity 是否作为velocity的属性  “N”不，“Y”是
     */
    public void setSignForVelocity(String signForVelocity) {
        this.signForVelocity = signForVelocity;
    }

    /**
     * @return event_type
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return created_by
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return modified_by
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return app_type
     */
    public String getAppType() {
        return appType;
    }

    /**
     * @param appType
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * @return sign_for_saas
     */
    public String getSignForSaas() {
        return signForSaas;
    }

    /**
     * @param signForSaas
     */
    public void setSignForSaas(String signForSaas) {
        this.signForSaas = signForSaas;
    }

    /**
     * @return saas_name
     */
    public String getSaasName() {
        return saasName;
    }

    /**
     * @param saasName
     */
    public void setSaasName(String saasName) {
        this.saasName = saasName;
    }

    /**
     * @return enum_values
     */
    public String getEnumValues() {
        return enumValues;
    }

    /**
     * @param enumValues
     */
    public void setEnumValues(String enumValues) {
        this.enumValues = enumValues;
    }

    /**
     * @return sys_default
     */
    public String getSysDefault() {
        return sysDefault;
    }

    /**
     * @param sysDefault
     */
    public void setSysDefault(String sysDefault) {
        this.sysDefault = sysDefault;
    }

    /**
     * @return main_property
     */
    public String getMainProperty() {
        return mainProperty;
    }

    /**
     * @param mainProperty
     */
    public void setMainProperty(String mainProperty) {
        this.mainProperty = mainProperty;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}