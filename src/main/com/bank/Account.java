package main.com.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountId;
    private Client client;
    private int balance;
    private List<Operation> operations = new ArrayList<>();

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public Account(int accountId, Client client) {
        this.accountId = accountId;
        this.client = client;
        this.balance = 0;
    }

}
