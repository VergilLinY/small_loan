package com.dt76.small_loan.pojo;


public class ApprovalLoan {

  private long alId;
  private long alTypeId;
  private String alLoanMoney;
  private String alTransactionNumber;
  private String alDocuments;
  private java.sql.Date alTime;
  private String alComment;
  private long boId;


  public long getAlId() {
    return alId;
  }

  public void setAlId(long alId) {
    this.alId = alId;
  }


  public long getAlTypeId() {
    return alTypeId;
  }

  public void setAlTypeId(long alTypeId) {
    this.alTypeId = alTypeId;
  }


  public String getAlLoanMoney() {
    return alLoanMoney;
  }

  public void setAlLoanMoney(String alLoanMoney) {
    this.alLoanMoney = alLoanMoney;
  }


  public String getAlTransactionNumber() {
    return alTransactionNumber;
  }

  public void setAlTransactionNumber(String alTransactionNumber) {
    this.alTransactionNumber = alTransactionNumber;
  }


  public String getAlDocuments() {
    return alDocuments;
  }

  public void setAlDocuments(String alDocuments) {
    this.alDocuments = alDocuments;
  }


  public java.sql.Date getAlTime() {
    return alTime;
  }

  public void setAlTime(java.sql.Date alTime) {
    this.alTime = alTime;
  }


  public String getAlComment() {
    return alComment;
  }

  public void setAlComment(String alComment) {
    this.alComment = alComment;
  }


  public long getBoId() {
    return boId;
  }

  public void setBoId(long boId) {
    this.boId = boId;
  }

}
