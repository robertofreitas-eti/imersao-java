package beans;

public class Account {

	private int id;
	private String accountType;
	private String person;
	private double ballance;
	private double creditLimit;

	public Account() {
	}

	public Account(int id, String accountType, String person, double ballance) {
		this.id = id;
		this.accountType = accountType;
		this.person = person;
		this.ballance = ballance;
	}

	public Account(int id, String accountType, String person, double ballance, double creditLimit) {
		this.id = id;
		this.accountType = accountType;
		this.person = person;
		this.ballance = ballance;
		this.creditLimit = creditLimit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public double getBallance() {
		return ballance;
	}

	public void setBallance(double ballance) {
		this.ballance = ballance;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String withdraw(Double value) {
		if (value <= (this.getBallance() + this.getCreditLimit())) {
			this.setBallance(this.getBallance() - value);
			return "Debit " + value + " Success!";
		} else {
			return "Insufficient Funds for debito " + value + " !";
		}
	}

	public void deposit(Double value) {
		this.setBallance(this.getBallance() + value);
	}

	/**
	 * Account type INVESTIMENT, SAVING ACCOUNT, CHECKING ACCOUNT
	 * 
	 * @param value
	 * @return
	 */
	public String defineCreditLimit(Double value) {
		if (value >= 0 && this.getAccountType().equalsIgnoreCase("CHECKING ACCOUNT")) {
			this.setCreditLimit(value);
			return "Success on define credit limit";
		} else {
			return "Account type invalid!";
		}
	}

	public String bankStatement() {
		return "Statement Account\n=========================================" + "\nNumber: " + this.getId() + "\nType: "
				+ this.getAccountType() + "\nPerson: " + this.getPerson() + "\nBallance: " + this.getBallance()
				+ "\nCredit Limit: " + this.getCreditLimit() + "\n";
	}

}
