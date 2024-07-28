package org.katas.onbording;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountManager {
    private List<Transaction> transactions = new ArrayList<>();
    public void register(int amount, int balance) {
        transactions.add(new Transaction(new Date().toString(), amount, balance));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
