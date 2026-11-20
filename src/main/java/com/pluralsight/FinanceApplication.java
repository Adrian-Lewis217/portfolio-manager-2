package com.pluralsight;

import com.pluralsight.finance.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", new BigDecimal("12500"));
        Valuable account2 = new BankAccount("Gary", "456", new BigDecimal("1500"));
        List<Valuable> assets = new ArrayList<>();

        // try to deposit money into both accounts
        account1.deposit(new BigDecimal("100"));
        /*
        * account2.deposit(BigDecimal.valueOf(100.00));
        * Cannot resolve method 'deposit' in 'Valuable'
        * */

        // have fun with the getValue()
        System.out.printf("Account 1 value: $%.2f%n", account1.getValue());

        // Test methods for Portfolio
        assets.add(new BankAccount("Mary","156",new BigDecimal("7100")));
        assets.add(new House("Potato",2000,10000,4));
        assets.add(new Gold("Tomato",7500));

        Portfolio portfolio = new Portfolio("Inheritance","Diana",assets);

        System.out.println("Total Value: $" + portfolio.getValue());
        System.out.println("Most Valuable Asset Value: $" + portfolio.getMostValuable().getValue());
        System.out.println("Least Valuable Asset Value: $" + portfolio.getLeastValuable().getValue());
    }
}
