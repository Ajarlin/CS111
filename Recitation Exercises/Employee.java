public class Employee{

	public String name;
	private double balance;
	private double rate;

	public Employee(String name, double balance, double hourly){
		this.name = name;
		this.rate = hourly;
		this.balance = balance;
	}

	public Employee (String name, int hourly){
		this.name = name;
		this.rate = hourly;
		this.balance = 0;
	}

	public void work(int hours){
		this.balance += this.rate*hours;
	}

	public void spend(double amount){
		this.balance -= amount;
	}

	public double getBalance(){
		return this.balance;
	}

	public double getRate(){
		return this.rate;
	}

	public void setRate(double newRate){
		this.rate = newRate;
	}

	public boolean equals(Employee other){
		return this.name.equals(other.name);
	}

	public void printinfo(){
		System.out.println("Employee name is " + this.name + ", rate is " + this.rate + ", balance is " + this.balance);
	}
}
