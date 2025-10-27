package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDTO {
    
    private Long id;
    
    @JsonProperty("productID")
    private String productID;
    
    @JsonProperty("productName")
    private String productName;
    
    private String amount;
    
    @JsonProperty("customerName")
    private String customerName;
    
    private Integer status;
    
    @JsonProperty("transactionDate")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String transactionDate;
    
    @JsonProperty("createBy")
    private String createBy;
    
    @JsonProperty("createOn")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createOn;
    
    // Default Constructor
    public TransactionDTO() {}
    
    // All Args Constructor
    public TransactionDTO(Long id, String productID, String productName, String amount,
                         String customerName, Integer status, String transactionDate,
                         String createBy, String createOn) {
        this.id = id;
        this.productID = productID;
        this.productName = productName;
        this.amount = amount;
        this.customerName = customerName;
        this.status = status;
        this.transactionDate = transactionDate;
        this.createBy = createBy;
        this.createOn = createOn;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getProductID() {
        return productID;
    }
    
    public void setProductID(String productID) {
        this.productID = productID;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public String getAmount() {
        return amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getTransactionDate() {
        return transactionDate;
    }
    
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public String getCreateBy() {
        return createBy;
    }
    
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    
    public String getCreateOn() {
        return createOn;
    }
    
    public void setCreateOn(String createOn) {
        this.createOn = createOn;
    }
}