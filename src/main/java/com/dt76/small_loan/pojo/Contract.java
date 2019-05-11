package com.dt76.small_loan.pojo;


public class Contract {

  private long cId;
  private String cAddress;
  private double cTotalMoney;
  private double cContractMoney;
  private double cRate;


  public long getCId() {
    return cId;
  }

  public void setCId(long cId) {
    this.cId = cId;
  }


  public String getCAddress() {
    return cAddress;
  }

  public void setCAddress(String cAddress) {
    this.cAddress = cAddress;
  }


  public double getCTotalMoney() {
    return cTotalMoney;
  }

  public void setCTotalMoney(double cTotalMoney) {
    this.cTotalMoney = cTotalMoney;
  }


  public double getCContractMoney() {
    return cContractMoney;
  }

  public void setCContractMoney(double cContractMoney) {
    this.cContractMoney = cContractMoney;
  }


  public double getCRate() {
    return cRate;
  }

  public void setCRate(double cRate) {
    this.cRate = cRate;
  }

}
