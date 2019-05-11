package com.dt76.small_loan.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RepaymentInfo {

    private String loanId;
    private String userName;
    private String contractNo;
    private Date applicationDate;
    private double applicationQuota;
    private double approvalAmount;
    private double contractAmount;
    private int borrowingPeriod;
    private String loanType;
    private int repaymentType;
    private Date loanTime;
    private int loanChannel;
    private int status;

    public RepaymentInfo() {
    }

    public RepaymentInfo(String loanId, String userName, String contractNo, Date applicationDate, double applicationQuota, double approvalAmount, double contractAmount, int borrowingPeriod, String loanType, int repaymentType, Date loanTime, int loanChannel, int status) {
        this.loanId = loanId;
        this.userName = userName;
        this.contractNo = contractNo;
        this.applicationDate = applicationDate;
        this.applicationQuota = applicationQuota;
        this.approvalAmount = approvalAmount;
        this.contractAmount = contractAmount;
        this.borrowingPeriod = borrowingPeriod;
        this.loanType = loanType;
        this.repaymentType = repaymentType;
        this.loanTime = loanTime;
        this.loanChannel = loanChannel;
        this.status = status;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public double getApplicationQuota() {
        return applicationQuota;
    }

    public void setApplicationQuota(double applicationQuota) {
        this.applicationQuota = applicationQuota;
    }

    public double getApprovalAmount() {
        return approvalAmount;
    }

    public void setApprovalAmount(double approvalAmount) {
        this.approvalAmount = approvalAmount;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public int getBorrowingPeriod() {
        return borrowingPeriod;
    }

    public void setBorrowingPeriod(int borrowingPeriod) {
        this.borrowingPeriod = borrowingPeriod;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(int repaymentType) {
        this.repaymentType = repaymentType;
    }

    public Date getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(Date loanTime) {
        this.loanTime = loanTime;
    }

    public int getLoanChannel() {
        return loanChannel;
    }

    public void setLoanChannel(int loanChannel) {
        this.loanChannel = loanChannel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
