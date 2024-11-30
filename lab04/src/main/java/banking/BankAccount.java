package banking;

public class BankAccount {
    private double currBalance;

    public BankAccount() {
        this.currBalance = 0;
    }

    /**
     * deposit money
     * Precondition: amount > 0
     * Postcondition: newBalance > oldBalance
     * @param amount
     */
    public void depositMoney(double amount) {

        currBalance += amount;

    }

    /**
     * withdraw money
     * PreCondition: amount > 0
     * Postcondition: newBalance < oldBalance
     * @param amount
     */
    public void withdrawMoney(double amount) {
        currBalance -= amount;
    }

    public double getCurrBalance() {
        return currBalance;
    }

    public void setCurrBalance(double currBalance) {
        this.currBalance = currBalance;
    }

    
}