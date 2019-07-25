package co.simplon.entities;

public class Operation {
	private int NumOp ;
	private double Amount;
	private int NumAt;
	
	public Operation (int NumOp , double Amount, int NumAt) {
		this.NumOp  = NumOp ;
		this.Amount = Amount;
		this.NumAt = NumAt;
	}

	public int getNumOp () {
		return NumOp ;
	}
	public void setNumOp (int NumOp ) {
		this.NumOp = NumOp ;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	public int getNumAt() {
		return NumAt;
	}
	public void setNumAt(int NumAt) {
		this.NumAt = NumAt;
	}

	@Override
	
	public String toString() {
		return "Operation [NumOp=" + NumOp + ", Amount=" + Amount + ", NumAt=" + NumAt + "]";
	}
    
    } 
	

