package com.madebyibrahim.digijava.controllers;

import com.madebyibrahim.digijava.models.Transaction;
import com.madebyibrahim.digijava.services.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        log.info("GET /transactions");
        return transactionService.getDummyTransactions();
    }
}
