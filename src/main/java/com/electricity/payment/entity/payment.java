package com.electricity.payment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paymentId;
	@NotNull(message = "accountNumber must not be null or empty")
	private Long accountNumber;
	private String cardHolderName;
	@NotNull(message = "amount must not be null or empty")
	private double amount;
	@NotNull(message = "cardNumber must not be null or empty")
	private Long cardNumber;
	@NotNull(message = "cvv must not be null or empty")
	private int cvv;
	private String paymentDate;
	private double latePaymentCharges;
	private double totalPaid;
	@NotNull(message = "status must not be null or empty")
	private String status;
	private Long billId;
//	public payment(Long paymentId, Long accountNumber, String cardHolderName, double amount, Long cardNumber, int cvv,
//			String paymentDate, double latePaymentCharges, double totalPaid, String status, Long billId) {
//		super();
//		this.paymentId = paymentId;
//		this.accountNumber = accountNumber;
//		this.cardHolderName = cardHolderName;
//		this.amount = amount;
//		this.cardNumber = cardNumber;
//		this.cvv = cvv;
//		this.paymentDate = paymentDate;
//		this.latePaymentCharges = latePaymentCharges;
//		this.totalPaid = totalPaid;
//		this.status = status;
//		this.billId = billId;
//	}
//	public payment() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Long getPaymentId() {
//		return paymentId;
//	}
//	public void setPaymentId(Long paymentId) {
//		this.paymentId = paymentId;
//	}
//	public Long getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(Long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	public String getCardHolderName() {
//		return cardHolderName;
//	}
//	public void setCardHolderName(String cardHolderName) {
//		this.cardHolderName = cardHolderName;
//	}
//	public double getAmount() {
//		return amount;
//	}
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//	public Long getCardNumber() {
//		return cardNumber;
//	}
//	public void setCardNumber(Long cardNumber) {
//		this.cardNumber = cardNumber;
//	}
//	public int getCvv() {
//		return cvv;
//	}
//	public void setCvv(int cvv) {
//		this.cvv = cvv;
//	}
//	public String getPaymentDate() {
//		return paymentDate;
//	}
//	public void setPaymentDate(String paymentDate) {
//		this.paymentDate = paymentDate;
//	}
//	public double getLatePaymentCharges() {
//		return latePaymentCharges;
//	}
//	public void setLatePaymentCharges(double latePaymentCharges) {
//		this.latePaymentCharges = latePaymentCharges;
//	}
//	public double getTotalPaid() {
//		return totalPaid;
//	}
//	public void setTotalPaid(double totalPaid) {
//		this.totalPaid = totalPaid;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public Long getBillId() {
//		return billId;
//	}
//	public void setBillId(Long billId) {
//		this.billId = billId;
//	}
//	@Override
//	public String toString() {
//		return "payment [paymentId=" + paymentId + ", accountNumber=" + accountNumber + ", cardHolderName="
//				+ cardHolderName + ", amount=" + amount + ", cardNumber=" + cardNumber + ", cvv=" + cvv
//				+ ", paymentDate=" + paymentDate + ", latePaymentCharges=" + latePaymentCharges + ", totalPaid="
//				+ totalPaid + ", status=" + status + ", billId=" + billId + "]";
//	}
//	
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getLatePaymentCharges() {
		return latePaymentCharges;
	}
	public void setLatePaymentCharges(double latePaymentCharges) {
		this.latePaymentCharges = latePaymentCharges;
	}
	public double getTotalPaid() {
		return totalPaid;
	}
	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	
	
	
	

}
