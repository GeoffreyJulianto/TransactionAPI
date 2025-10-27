package com.example.demo.model;

import com.example.demo.dto.TransactionDTO;
import java.util.List;

public class TransactionResponse {
    
    private List<TransactionDTO> data;
    private List<Status> status;
    
    public TransactionResponse() {}
    
    public TransactionResponse(List<TransactionDTO> data, List<Status> status) {
        this.data = data;
        this.status = status;
    }
    
    public List<TransactionDTO> getData() {
        return data;
    }
    
    public void setData(List<TransactionDTO> data) {
        this.data = data;
    }
    
    public List<Status> getStatus() {
        return status;
    }
    
    public void setStatus(List<Status> status) {
        this.status = status;
    }
}