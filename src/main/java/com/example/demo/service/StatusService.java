package com.example.demo.service;

import com.example.demo.model.Status;
import com.example.demo.repository.StatusRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatusService {
    private final StatusRepository repository;

    public StatusService(StatusRepository repository) {
        this.repository = repository;
    }

    public List<Status> getAllStatuses() {
        return repository.findAll();
    }
}
