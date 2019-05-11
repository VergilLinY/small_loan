package com.dt76.small_loan.pojo;


public class HLoanProducts {

  private long productId;
  private String productName;
  private String loanType;
  private String tag;
  private long sort;
  private String state;
  private String productCover;
  private String productIntroduction;


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getProductCover() {
    return productCover;
  }

  public void setProductCover(String productCover) {
    this.productCover = productCover;
  }


  public String getProductIntroduction() {
    return productIntroduction;
  }

  public void setProductIntroduction(String productIntroduction) {
    this.productIntroduction = productIntroduction;
  }

}
