package com.madebyibrahim.digijava.services;

import com.madebyibrahim.digijava.models.Transaction;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class TransactionService {
    private final Random random = new Random();
    private List<Transaction> transactions;

    @PostConstruct
    public void init() {
        transactions = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            transactions.add(new Transaction(i, getRandomCategory(), getRandomAmount()));
        }
    }

    public List<Transaction> getDummyTransactions() {
        return transactions;
    }

    private String getRandomCategory() {
        String[] categories = { "food", "clothing", "entertainment", "transportation", "housing", "utilities" };
        return categories[random.nextInt(categories.length)];
    }

    private double getRandomAmount() {
        return random.nextDouble() * 1000;
    }

}
