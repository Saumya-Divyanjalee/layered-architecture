package com.example.layeredarchitecture.entity;

import java.io.Serializable;
import java.math.BigDecimal;



public class OrderDetail implements Serializable {
    public OrderDetail(String orderId, int qty, BigDecimal unitPrice) {
        this.orderId = orderId;
    }

    public OrderDetail(String orderId, String itemCode, int qty, BigDecimal unitPrice) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    private String orderId;
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    public OrderDetail() {
    }



    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" +
                "itemCode='" + itemCode + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
