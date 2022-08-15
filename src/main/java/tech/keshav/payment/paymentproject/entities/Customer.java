package tech.keshav.payment.paymentproject.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Customer {
    @Id
    String accountNumber;
    public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(Double clearBalance) {
		this.clearBalance = clearBalance;
	}
	public void setOverdraft(Boolean overdraft) {
		this.overdraft = overdraft;
	}
	@NotNull
    String name;
    @NotNull
    Double clearBalance;
    @NotNull
    Boolean overdraft;
	public boolean getOverdraft() {
		// TODO Auto-generated method stub
		return false;
	}

}