package com.dt76.small_loan.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;

@Component
public class BorrowOrder {

  private long boId;
  private long uId;
  private Timestamp oCreateTime;
  private String oWantedMoney;
  private String oRepayMode;
  private long oLoanTime;
  private long pId;
  private String lType;
  private long cId;
  private String boType;

  private User user;

  private List<CheckState> checkStates;

  private Employee employee;

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  private HLoanProducts hLoanProducts;

  public long getBoId() {
    return boId;
  }

  public void setBoId(long boId) {
    this.boId = boId;
  }

  public long getuId() {
    return uId;
  }

  public void setuId(long uId) {
    this.uId = uId;
  }

  @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
  public Timestamp getoCreateTime() {
    return oCreateTime;
  }

  public void setoCreateTime(Timestamp oCreateTime) {
    this.oCreateTime = oCreateTime;
  }

  public String getoWantedMoney() {
    return oWantedMoney;
  }

  public void setoWantedMoney(String oWantedMoney) {
    this.oWantedMoney = oWantedMoney;
  }

  public String getoRepayMode() {
    return oRepayMode;
  }

  public void setoRepayMode(String oRepayMode) {
    this.oRepayMode = oRepayMode;
  }

  public long getoLoanTime() {
    return oLoanTime;
  }

  public void setoLoanTime(long oLoanTime) {
    this.oLoanTime = oLoanTime;
  }

  public long getpId() {
    return pId;
  }

  public void setpId(long pId) {
    this.pId = pId;
  }

  public String getlType() {
    return lType;
  }

  public void setlType(String lType) {
    this.lType = lType;
  }

  public long getcId() {
    return cId;
  }

  public void setcId(long cId) {
    this.cId = cId;
  }

  public String getBoType() {
    return boType;
  }

  public void setBoType(String boType) {
    this.boType = boType;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<CheckState> getCheckStates() {
    return checkStates;
  }

  public void setCheckStates(List<CheckState> checkStates) {
    this.checkStates = checkStates;
  }

  public HLoanProducts gethLoanProducts() {
    return hLoanProducts;
  }

  public void sethLoanProducts(HLoanProducts hLoanProducts) {
    this.hLoanProducts = hLoanProducts;
  }

    @Override
    public String toString() {
        return "BorrowOrder{" +
                "boId=" + boId +
                ", uId=" + uId +
                ", oCreateTime=" + oCreateTime +
                ", oWantedMoney='" + oWantedMoney + '\'' +
                ", oRepayMode='" + oRepayMode + '\'' +
                ", oLoanTime=" + oLoanTime +
                ", pId=" + pId +
                ", lType='" + lType + '\'' +
                ", cId=" + cId +
                ", boType='" + boType + '\'' +
                ", user=" + user +
                ", checkStates=" + checkStates +
                ", employee=" + employee +
                ", hLoanProducts=" + hLoanProducts +
                '}';
    }
}
