package com.company;

import com.sun.source.tree.IfTree;

import javax.naming.LimitExceededException;

public class BankAccount {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) throws LimitException {
        amount += sum;
        System.out.println("Вы пополнили счет " + (int) getAmount() + " сом");
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            System.out.println("Операция не доступна " + amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли " + sum + "сом " + "Остаток на счету " + amount) ;
        }
    }
}
