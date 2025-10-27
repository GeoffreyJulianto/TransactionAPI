package com.example.demo.service;

import com.example.demo.dto.TransactionDTO;

import com.example.demo.model.Transaction;
import com.example.demo.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    
    private final TransactionRepository repository;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }
    
    public List<TransactionDTO> getAllTransactions() {
        List<Transaction> transactions = repository.findAll();
        return transactions.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    
    private TransactionDTO convertToDTO(Transaction transaction) {
        TransactionDTO dto = new TransactionDTO();
        dto.setId(transaction.getId());
        dto.setProductID(transaction.getProductID());
        dto.setProductName(transaction.getProductName());
        dto.setAmount(transaction.getAmount());
        dto.setCustomerName(transaction.getCustomerName());
        dto.setStatus(transaction.getStatus());
        dto.setTransactionDate(transaction.getTransactionDate() != null ? 
            transaction.getTransactionDate().format(formatter) : null);
        dto.setCreateBy(transaction.getCreateBy());
        dto.setCreateOn(transaction.getCreateOn() != null ? 
            transaction.getCreateOn().format(formatter) : null);
        return dto;
    }
}