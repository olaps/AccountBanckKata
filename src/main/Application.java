package main;

import main.com.bank.Account;
import main.com.bank.Client;
import main.com.bank.service.AcountServiceImpl;
import main.com.bank.service.IAccountService;

public class Application {

    public static void main(String[] args){

        // Create a client
        Client client = new Client(1, "Ismail");

        // Create account of this client
        Account account = new Account(1, client);

        // Inject a sample Service account
        IAccountService service = new AcountServiceImpl();

        System.out.println("Initial Account Balance = "+ account.getBalance() + " for Client : "+ account.getClient().getClientName());

        // US 1: save money
        service.saveMoney(account, 1000);
        service.saveMoney(account, 500);

        // US 2: retreive money
        service.retrieveMoney(account,800);
        service.retrieveMoney(account,900);

        // US 1: save money
        service.saveMoney(account, 5800);
        service.saveMoney(account, -21);

        // US 2: retreive money
        service.retrieveMoney(account, -99);
        service.retrieveMoney(account, 0);
        service.retrieveMoney(account, 1000);

        // US 3: see historique operation
        service.checkOperation(account);

        // Create a new client
        Client clientGorge = new Client(2, "Gorge");

        // Create new account client
        Account accountGorge = new Account(2, clientGorge);
        System.out.println("Initial Account Balance = "+ accountGorge.getBalance() + " for Client : "+ accountGorge.getClient().getClientName());
        service.saveMoney(accountGorge, 2000);

        // US 3: see historique operation
        service.checkOperation(accountGorge);


    }
}
