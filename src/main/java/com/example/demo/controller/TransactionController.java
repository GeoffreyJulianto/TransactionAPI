package com.example.demo.controller;

import com.example.demo.dto.TransactionDTO;
import com.example.demo.model.TransactionResponse;
import com.example.demo.model.Status;
import com.example.demo.service.TransactionService;
import com.example.demo.service.StatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionController {
    
    private final TransactionService transactionService;
    private final StatusService statusService;
    
    public TransactionController(TransactionService transactionService, StatusService statusService) {
        this.transactionService = transactionService;
        this.statusService = statusService;
    }
    
    @GetMapping("/view-data")
    public ResponseEntity<TransactionResponse> getViewData() {
        List<TransactionDTO> transactions = transactionService.getAllTransactions();
        List<Status> statuses = statusService.getAllStatuses();
        TransactionResponse response = new TransactionResponse(transactions, statuses);
        return ResponseEntity.ok(response);
    }
}