package banking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoggedBankAccount extends BankAccount{
    private List<String> log;
    private LocalDate currDate;

    public LoggedBankAccount() {
        log = new ArrayList<String>();
        currDate = LocalDate.now();
    }

    @Override
    public void depositMoney(double amount) {
        double oldBalance = super.getCurrBalance();
        super.depositMoney(amount);
        if (super.getCurrBalance() > oldBalance) {
            log.add("A valid deposit of " + amount + " was made at " + currDate);
        } else {
            // reset back to original amount if invalid deposit
            super.setCurrBalance(oldBalance - amount);
            log.add("An invalid deposit of " + amount + " was made at " + currDate);
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        double oldBalance = super.getCurrBalance();
        super.depositMoney(amount);
        if (super.getCurrBalance() > oldBalance) {
            log.add("A valid withdrawal of " + amount + " was made at " + currDate);
        } else {
            // reset back to original amount if invalid withdrawal
            super.setCurrBalance(oldBalance + amount);
            log.add("An invalid withdrawal of " + amount + " was made at " + currDate);
        }
    }

    
}
