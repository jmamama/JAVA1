
public class AccountingApp {
	//공급가액
	public static double valueOFSupply = 10000.0;			
	//부가가치세율
	public static double vatRate = 0.1;
	
	public static double getVAT() {
		return valueOFSupply * vatRate;		
	}
	public static double getTotal() {
		return valueOFSupply + getVAT();
	}
	public static void main(String[] args) {
				
		//부가세
		//double vat = valueOFSupply * vatRate;
		//double vat = getVAT();
		//합계
		//double total = valueOFSupply + vat;
		//double total = getTotal();
				
		System.out.println("Value of supply :"  + valueOFSupply );
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());

	}

}
