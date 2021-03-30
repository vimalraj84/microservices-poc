package com.bilqu.odrmgmt.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Order")
public class Order {

    @Id
    private Integer orderId;
    @Column(name = "SKU")
    private Integer sku;
    @Column(name="QTY")
    private int qty;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "CUST_ID")
    private Integer custId;
    @Column(name = "PAYMENT_ID")
    private Integer paymentId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }
}
