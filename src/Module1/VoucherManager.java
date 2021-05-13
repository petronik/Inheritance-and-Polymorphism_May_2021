

import java.util.ArrayList;

public class VoucherManager {
	
	private int _nextVoucherNumber;
	private int _nextCheckNumber;
	//private Voucher[] _vouchers;
	private ArrayList<Voucher> _vouchers = new ArrayList<>();
	
	public VoucherManager(int firstVoucher, int firstCheck) {
    	_nextVoucherNumber =  firstVoucher;
    	_nextCheckNumber = firstCheck;
	}
	
	public void add(String purchaseDate, double amount, String debitAccount, String vendor) {
			_vouchers.add(new Voucher(_nextVoucherNumber++, purchaseDate, amount, debitAccount, vendor));
	} 
	
	public Voucher find(int number) {
		
		for(Voucher v : _vouchers) {
			if(v.getVoucherNumber() == number)
				return v;
		}
		
		return null;
	}
	
	public void printData() {
		
		for(Voucher v : _vouchers) {
			if(v != null)
				System.out.println(v);
		}
	}
}
