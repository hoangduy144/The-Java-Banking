package com.example.the_java_bank.service.impl;

import com.example.the_java_bank.dto.TransactionDTO;
import com.example.the_java_bank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDTO transactionDTO);
}
