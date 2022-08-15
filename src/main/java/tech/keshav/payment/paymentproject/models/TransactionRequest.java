package tech.keshav.payment.paymentproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionRequest {
    private TransactionPayload payload;

	public TransactionPayload getPayload() {
		return payload;
	}

	public void setPayload(TransactionPayload payload) {
		this.payload = payload;
	}
}