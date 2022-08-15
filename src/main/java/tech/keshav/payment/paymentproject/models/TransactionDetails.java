package tech.keshav.payment.paymentproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionDetails {
    public TransactionDetails(Double transferFee2, Double totalAmount2, String transferTypeCode2) {
		// TODO Auto-generated constructor stub
	}
	public Double getTransferFee() {
		return transferFee;
	}
	public void setTransferFee(Double transferFee) {
		this.transferFee = transferFee;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTransferTypeCode() {
		return transferTypeCode;
	}
	public void setTransferTypeCode(String transferTypeCode) {
		this.transferTypeCode = transferTypeCode;
	}
	private Double transferFee;
    private Double totalAmount;
    private String transferTypeCode;

}