package com.bilqu.pymt.eo;

import javax.persistence.*;

@Entity(name = "PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pay_seq")
    @SequenceGenerator(name = "pay_seq", sequenceName = "PAYMENT_ID", initialValue = 7001, allocationSize = 1)
    private Integer paymentId;
    @Column(name="MODE")
    private String mode;
    @Column(name="ORDER_ID")
    private Integer orderId;
    @Column(name="CUST_ID")
    private Integer custId;
    @Column(name = "STATUS")
    private String status;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
