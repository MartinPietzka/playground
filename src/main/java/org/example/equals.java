package org.example;

import java.util.Objects;

class Money {
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currencyCode, money.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currencyCode);
    }
}


public class equals {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);
        System.out.println(income.hashCode());
        System.out.println(expenses.hashCode());

        income = expenses;
        boolean bool = income.equals(expenses);
        System.out.println(bool);
        System.out.println(income.getClass());
        System.out.println(income.hashCode());
        System.out.println(expenses.hashCode());
    }
}
