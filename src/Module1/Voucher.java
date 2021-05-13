

public class Voucher {
	private int _voucherNumber;
	private String _purchaseDate;
	private double _amount;
	private String _debitAccount;
	private String _vendor;
	
	private int _checkNumber;
	private String _paymentDate;
	
	public Voucher(int nextVoucherNumber, String purchaseDate, double amount, 
					String debitAccount, String vendor) {
		_purchaseDate = purchaseDate;
		_amount = amount;
		_debitAccount = debitAccount;
		_vendor = vendor;
		_voucherNumber = nextVoucherNumber;
	}
	
	public int getVoucherNumber() {
		return _voucherNumber;
	}
	
	public String toString() {
		return _voucherNumber + " " +_amount;
	}
}
