package com.dt76.small_loan.pojo;


public class CheckState {

  private long csId;
  private long boId;
  private long mId;
  private java.sql.Timestamp mDate;
  private long mType;
  private String mResult;
  private String mComment;
  private long mApproveMoney;
  private long mContractMoney;


  public long getCsId() {
    return csId;
  }

  public void setCsId(long csId) {
    this.csId = csId;
  }


  public long getBoId() {
    return boId;
  }

  public void setBoId(long boId) {
    this.boId = boId;
  }


  public long getMId() {
    return mId;
  }

  public void setMId(long mId) {
    this.mId = mId;
  }


  public java.sql.Timestamp getMDate() {
    return mDate;
  }

  public void setMDate(java.sql.Timestamp mDate) {
    this.mDate = mDate;
  }


  public long getMType() {
    return mType;
  }

  public void setMType(long mType) {
    this.mType = mType;
  }


  public String getMResult() {
    return mResult;
  }

  public void setMResult(String mResult) {
    this.mResult = mResult;
  }


  public String getMComment() {
    return mComment;
  }

  public void setMComment(String mComment) {
    this.mComment = mComment;
  }


  public long getMApproveMoney() {
    return mApproveMoney;
  }

  public void setMApproveMoney(long mApproveMoney) {
    this.mApproveMoney = mApproveMoney;
  }


  public long getMContractMoney() {
    return mContractMoney;
  }

  public void setMContractMoney(long mContractMoney) {
    this.mContractMoney = mContractMoney;
  }

}
