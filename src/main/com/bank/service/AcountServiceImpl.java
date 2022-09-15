package main.com.bank.service;

import main.com.bank.Account;
import main.com.bank.Operation;
import main.com.bank.enums.OperationEnum;

import java.time.LocalDateTime;

public class AcountServiceImpl implements IAccountService {

    @Override
    public void saveMoney(Account account, int amount) {
        if(amount <= 0){
            System.out.println("Cannot save empty or negatif amount !!");
            return;
        }
        int newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
        // add history DEPOSIT operation
        Operation opDeposit = new Operation(OperationEnum.DEPOSIT, LocalDateTime.now(),amount);
        account.getOperations().add(opDeposit);
        // New Balance after operation
        System.out.println("New Balance after deposit "+amount+ " : " + account.getBalance());
    }

    @Override
    public void retrieveMoney(Account account, int amount) {
        if(amount <= 0){
            System.out.println("Cannot retrieve empty or negatif amount !!");
            return;
        }
        int currentBalance = account.getBalance();
        if(currentBalance <= 0 || currentBalance < amount){
             System.out.println("Insufficient balance [amout to retrieve = "+amount+" , Account balance = "+account.getBalance()+"]");
             return;
        }
        int newBalance = currentBalance - amount;
        account.setBalance(newBalance);
        // add history WITHDRAWAL operation
        Operation opWithdrawal = new Operation(OperationEnum.WITHDRAWAL, LocalDateTime.now() ,amount);
        account.getOperations().add(opWithdrawal);
        // New Balance after operation
        System.out.println("New Balance after withdraw "+amount+ " operation : " + account.getBalance());
    }

    @Override
    public void checkOperation(Account account) {
        System.out.println("Historique Operations for client : "+account.getClient().getClientName());
        account.getOperations().forEach(System.out::println);
    }
}
