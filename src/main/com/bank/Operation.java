package main.com.bank;

import main.com.bank.enums.OperationEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operation {
    private int operationId;
    private OperationEnum typeOperation;
    private LocalDateTime date;
    private int amount;

    public Operation(OperationEnum typeOperation, LocalDateTime date, int amount) {
        this.typeOperation = typeOperation;
        this.date = date;
        this.amount = amount;
    }

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public OperationEnum getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(OperationEnum typeOperation) {
        this.typeOperation = typeOperation;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDate = newPattern.format(date);

        return "  Operation [" +
                " Operation type = " + typeOperation +
                ", Date = " + formatDate +
                ", Amount = " + amount +
                " ]";
    }
}
