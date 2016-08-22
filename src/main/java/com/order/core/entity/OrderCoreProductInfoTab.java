package com.order.core.entity;

import com.order.core.vo.BaseVo;

import java.util.Date;

public class OrderCoreProductInfoTab extends BaseVo {
    private Integer productId;

    private String productName;

    private String productType;

    private Integer status;

    private String operater;

    private Date createTime;

    private Date updateTime;

    public OrderCoreProductInfoTab() {
    }

    public OrderCoreProductInfoTab(Integer productId, String productName, String productType, Integer status, String operater, Date createTime, Date updateTime) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.status = status;
        this.operater = operater;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}