package tech.keshav.payment.paymentproject.entities;

import lombok.*;
import tech.keshav.payment.paymentproject.models.TransactionStatus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class TransactionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer transactionID;

    public Integer getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getReceiverName() {
		return receiverName;
	}


	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}


	public String getReceiverAccountNumber() {
		return receiverAccountNumber;
	}


	public void setReceiverAccountNumber(String receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}


	public BankBIC getReceiverBIC() {
		return receiverBIC;
	}


	public void setReceiverBIC(BankBIC receiverBIC) {
		this.receiverBIC = receiverBIC;
	}


	public MessageCode getMessageCode() {
		return messageCode;
	}


	public void setMessageCode(MessageCode messageCode) {
		this.messageCode = messageCode;
	}


	public String getTransferCode() {
		return transferCode;
	}


	public void setTransferCode(String transferCode) {
		this.transferCode = transferCode;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	public TransactionStatus getStatus() {
		return status;
	}


	public void setStatus(TransactionStatus status) {
		this.status = status;
	}


	public String getFailureReason() {
		return failureReason;
	}


	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}


	@ManyToOne
    @JoinColumn(name = "customerId")
    @NotNull
    Customer customer;

    @NotNull
    String receiverName;

    @NotNull
    @Column(length = 14)
    String receiverAccountNumber;

    @ManyToOne
    @JoinColumn(name = "receiver_bic")
    @NotNull
    BankBIC receiverBIC;


    @ManyToOne
    @JoinColumn(name = "message_code")
    @NotNull
    MessageCode messageCode;


    @NotNull
    String transferCode;


    @NotNull
    Double amount;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    Date timestamp;

    @Enumerated(EnumType.STRING)
    TransactionStatus status = TransactionStatus.SUCCESS;


    String failureReason;

}