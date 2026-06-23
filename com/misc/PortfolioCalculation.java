package com.misc;

import java.util.HashMap;
import java.util.Map;

public class PortfolioCalculation {
    public static void main(String[] args) {
        Transaction[] txnDetails = new Transaction[]{
            new Transaction("AAPL", "BUY", 10),
            new Transaction("GOOG", "BUY", 5),
            new Transaction("AAPL", "SELL", 3)
        };

        Map<String, Integer> map = new HashMap<>();
        for (Transaction txn: txnDetails) {
            map.putIfAbsent(txn.stock, 0);

            if("BUY".equals(txn.action)) {
                map.put(txn.stock, map.get(txn.stock) + txn.quantity);
            } else if("SELL".equals(txn.action)) {
                map.put(txn.stock, map.get(txn.stock) - txn.quantity);
            }
        }
        System.out.println(map);
    }
}

class Transaction{
    String stock;
    String action;
    int quantity;

    Transaction(String stock, String action, int quantity){
        this.stock = stock;
        this.action = action;
        this.quantity = quantity;
    }
}
