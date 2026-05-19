package testbai2;

import org.example.bai2.code.BankService;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        bankService.withdraw("BIDV-123", 500000);

        bankService.withdraw("BIDV-123", -100);
    }
}