package com.bilqu.invt.eo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "INVENTORY")
public class Inventory {

    @Id
    private Integer sku;
    @Column(name = "PRODUCT_NAME")
    private String itemName;
    @Column(name = "ON_HAND")
    private int onHand;
    @Column(name = "UPC")
    private String upc;
    @Column(name = "PRICE")
    private BigDecimal price;

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getOnHand() {
        return onHand;
    }

    public void setOnHand(int onHand) {
        this.onHand = onHand;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
