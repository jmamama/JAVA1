
public class AccountingApp {
	//���ް���
	public static double valueOFSupply = 10000.0;			
	//�ΰ���ġ����
	public static double vatRate = 0.1;
	
	public static double getVAT() {
		return valueOFSupply * vatRate;		
	}
	public static double getTotal() {
		return valueOFSupply + getVAT();
	}
	public static void main(String[] args) {
				
		//�ΰ���
		//double vat = valueOFSupply * vatRate;
		//double vat = getVAT();
		//�հ�
		//double total = valueOFSupply + vat;
		//double total = getTotal();
				
		System.out.println("Value of supply :"  + valueOFSupply );
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());

	}

}
