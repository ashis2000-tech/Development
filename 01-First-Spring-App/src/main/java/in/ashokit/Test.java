package in.ashokit;

public class Test {

	public static void main(String[] args) {
		BillCollector bc = new BillCollector();
		bc.setPayment(new CreditcardPayment());
		bc.collectPayment(1400.00);
		BillCollector bc1 = new BillCollector(new DebitcardPayment());
		bc1.collectPayment(1500.00);
		BillCollector bc2 = new BillCollector(new UpiPayment());
		bc2.collectPayment(3000.00);
	}

}
