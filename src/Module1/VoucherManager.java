package Module1;

public class VoucherManager {
	
	private int _nextVoucherNumber;
	private int _nextCheckNumber;
	private Voucher[] _vouchers;
	
	public VoucherManager(int firstVoucher, int firstCheck, int maxNumberOfVouchers) {
    	_nextVoucherNumber =  firstVoucher;
    	_nextCheckNumber = firstCheck;
    	_vouchers = new Voucher[maxNumberOfVouchers];
	}
	
	public void add(String purchaseDate, double amount, String debitAccount, String vendor) {
		
		int minIndex = -1;
		
		for (int i = 0; i < _vouchers.length; i++) {
			if(_vouchers[i] == null) {
				minIndex = i;
				break;
			}
		}
		
		if(minIndex != -1) {
			Voucher newVoucher = 
					new Voucher(_nextVoucherNumber, purchaseDate, amount, debitAccount, vendor);
			_nextVoucherNumber++;
			
			_vouchers[minIndex] = newVoucher;
		}
	} 
	
	public void printData() {
		
		for(Voucher v : _vouchers) {
			if(v != null)
				System.out.println(v);
		}
	}
}
