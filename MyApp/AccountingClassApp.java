class Accounting{
	public  double valueOFSupply;
	public  double vatRate;
	public  double expenseRate;
	
	public  void print() {
		System.out.println("Value of supply : "+ valueOFSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend1 : "+ getDividend1());
		System.out.println("Dividend2 : "+ getDividend2());
		System.out.println("Dividend3 : "+ getDividend3());
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueOFSupply-getExpense();
	}

	public double getExpense() {
		return valueOFSupply*expenseRate;
	}

	public double getTotal( ) {
		return valueOFSupply + getVAT();
	}

	public double getVAT() {
		return valueOFSupply*vatRate;
	}
}
public class AccountingClassApp {
	public static void main(String[] args) {		
		// instance
		Accounting a1 = new Accounting();
		a1.valueOFSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOFSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
	}
	
}
