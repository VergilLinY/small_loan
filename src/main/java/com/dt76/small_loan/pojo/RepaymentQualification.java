package com.dt76.small_loan.pojo;

import java.util.Date;
import java.util.List;

public class RepaymentQualification {

    private Integer loanId;
    private String name;
    private String contractNo;
    private String loanType;
    private List<Date> dateRange;

    public RepaymentQualification() {
    }

    public RepaymentQualification(Integer loanId, String name, String contractNo, String loanType, List<Date> dateRange) {
        this.loanId = loanId;
        this.name = name;
        this.contractNo = contractNo;
        this.loanType = loanType;
        this.dateRange = dateRange;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public List<Date> getDateRange() {
        return dateRange;
    }

    public void setDateRange(List<Date> dateRange) {
        this.dateRange = dateRange;
    }

    @Override
    public String toString() {
        return "RepaymentQualification{" +
                "loanId=" + loanId +
                ", name='" + name + '\'' +
                ", contractNo='" + contractNo + '\'' +
                ", loanType=" + loanType +
                ", dateRange=" + dateRange +
                '}';
    }
}
