package com.dt76.small_loan.pojo;

import java.util.Date;

public class CommonLoanInfo {

    private Integer loanId;             //借款编号
    private String userName;            //用户姓名
    private Integer contractId;         //合同号
    private Date getLoanDate;           //申请日期
    private Integer loanAmount;         //申请额度
    private Integer approvalAmount;     //审批金额
    private Integer contractAmount;     //合同金额
    private Integer borrowingPeriod;    //借款期限
    private String loanType;            //贷款类型
    private String repaymentType;       //还款方式
    private Date loanDate;              //放款时间
    private String borrowType;          //放款方式
    private Boolean repaymentFinish;    //还款状态

    public CommonLoanInfo() {
    }

    public CommonLoanInfo(Integer loanId, String userName, Integer contractId, Date getLoanDate, Integer loanAmount, Integer approvalAmount, Integer contractAmount, Integer borrowingPeriod, String loanType, String repaymentType, Date loanDate, String borrowType, Boolean repaymentFinish) {
        this.loanId = loanId;
        this.userName = userName;
        this.contractId = contractId;
        this.getLoanDate = getLoanDate;
        this.loanAmount = loanAmount;
        this.approvalAmount = approvalAmount;
        this.contractAmount = contractAmount;
        this.borrowingPeriod = borrowingPeriod;
        this.loanType = loanType;
        this.repaymentType = repaymentType;
        this.loanDate = loanDate;
        this.borrowType = borrowType;
        this.repaymentFinish = repaymentFinish;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Date getGetLoanDate() {
        return getLoanDate;
    }

    public void setGetLoanDate(Date getLoanDate) {
        this.getLoanDate = getLoanDate;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Integer getApprovalAmount() {
        return approvalAmount;
    }

    public void setApprovalAmount(Integer approvalAmount) {
        this.approvalAmount = approvalAmount;
    }

    public Integer getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Integer contractAmount) {
        this.contractAmount = contractAmount;
    }

    public Integer getBorrowingPeriod() {
        return borrowingPeriod;
    }

    public void setBorrowingPeriod(Integer borrowingPeriod) {
        this.borrowingPeriod = borrowingPeriod;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType;
    }

    public Boolean getRepaymentFinish() {
        return repaymentFinish;
    }

    public void setRepaymentFinish(Boolean repaymentFinish) {
        this.repaymentFinish = repaymentFinish;
    }

    @Override
    public String toString() {
        return "CommomLoanInfo{" +
                "loanId=" + loanId +
                ", userName='" + userName + '\'' +
                ", contractId=" + contractId +
                ", getLoanDate=" + getLoanDate +
                ", loanAmount=" + loanAmount +
                ", approvalAmount=" + approvalAmount +
                ", contractAmount=" + contractAmount +
                ", borrowingPeriod=" + borrowingPeriod +
                ", loanType='" + loanType + '\'' +
                ", repaymentType='" + repaymentType + '\'' +
                ", loanDate=" + loanDate +
                ", borrowType='" + borrowType + '\'' +
                ", repaymentFinish=" + repaymentFinish +
                '}';
    }
}
