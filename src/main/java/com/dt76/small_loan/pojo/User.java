package com.dt76.small_loan.pojo;


public class User {

  private long userId;
  private long userPhone;
  private String userName;
  private String userRank;
  private long loanMoney;
  private long loanNum;
  private long remain;
  private long condition;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(long userPhone) {
    this.userPhone = userPhone;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserRank() {
    return userRank;
  }

  public void setUserRank(String userRank) {
    this.userRank = userRank;
  }


  public long getLoanMoney() {
    return loanMoney;
  }

  public void setLoanMoney(long loanMoney) {
    this.loanMoney = loanMoney;
  }


  public long getLoanNum() {
    return loanNum;
  }

  public void setLoanNum(long loanNum) {
    this.loanNum = loanNum;
  }


  public long getRemain() {
    return remain;
  }

  public void setRemain(long remain) {
    this.remain = remain;
  }


  public long getCondition() {
    return condition;
  }

  public void setCondition(long condition) {
    this.condition = condition;
  }

}
