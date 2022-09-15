package main.com.bank.service;

import main.com.bank.Account;

public interface IAccountService {
    void saveMoney(Account account, int amount);
    void retrieveMoney(Account account, int amount);
    void checkOperation(Account account);

}
