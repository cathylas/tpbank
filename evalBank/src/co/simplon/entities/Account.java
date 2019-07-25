package co.simplon.entities;
import java.util.Date;

public class Account {
	private int NumAt;
	private Date DateCreation;
	private double Balance;
	private int IdCust;
	
	public Account (int NumAt, Date DateCreation, double Balance, int IdCust) {
		this.NumAt = NumAt;
		this.DateCreation = DateCreation;
		this.Balance = Balance;
		this.IdCust = IdCust ;                                                                                                                        
	}
	public int NumAt() {
		return NumAt;
	}
	public void setNumAt(int NumAt) {
		this.NumAt = NumAt;
    }
	public Date DateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date DateCreation) {
		this.DateCreation = DateCreation;
	}
	public double Balance() {
		return Balance;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	public int IdCust() {
		return IdCust;
	}
	public void setIdCust(int IdCust) {
		this.IdCust= IdCust;
    }
	
	@Override
	
	public String toString() {
		
		return "Account [NumAt=" + NumAt + ", DateCreation=" + DateCreation +", Balance=" + Balance + ", IdCust=" + IdCust  + "]";
	}
    
    }

