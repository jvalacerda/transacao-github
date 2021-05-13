package bank;

public class Transaction {
	private int acNumber;
	private String acHolder;
	private double balance;
	
	public Transaction(int acNumber, String acHolder, double initialDeposit) {
		this.acNumber = acNumber;
		this.acHolder = acHolder;
		deposit(initialDeposit);
	}
	
	public Transaction(int acNumber, String acHolder) {
		this.acNumber = acNumber;
		this.acHolder = acHolder;
	}

	public int getAcNumber() {
		return acNumber;
	}

	public String getAcHolder() {
		return acHolder;
	}

	public void setAcHolder(String acHolder) {
		this.acHolder = acHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double dep) {
		balance += dep;
	}
	
	public void withdraw(double wit) {
		balance -= wit + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ acNumber
				+ ", Holder: "
				+ acHolder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
