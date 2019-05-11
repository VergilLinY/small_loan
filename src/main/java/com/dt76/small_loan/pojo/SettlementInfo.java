package com.dt76.small_loan.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SettlementInfo {

    private String loanId;
    private Integer summaryPoint;
    private Date summaryDate;
    private String summaryDescription;
    private BorrowOrder borrowOrder;
    private Boolean finished;

    public SettlementInfo() {
    }

    public SettlementInfo(String loanId, Integer summaryPoint, Date summaryDate, String summaryDescription, BorrowOrder borrowOrder, Boolean finished) {
        this.loanId = loanId;
        this.summaryPoint = summaryPoint;
        this.summaryDate = summaryDate;
        this.summaryDescription = summaryDescription;
        this.borrowOrder = borrowOrder;
        this.finished = finished;
    }

    public BorrowOrder getBorrowOrder() {
        return borrowOrder;
    }

    public void setBorrowOrder(BorrowOrder borrowOrder) {
        this.borrowOrder = borrowOrder;
    }


    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Integer getSummaryPoint() {
        return summaryPoint;
    }

    public void setSummaryPoint(Integer summaryPoint) {
        this.summaryPoint = summaryPoint;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getSummaryDate() {
        return summaryDate;
    }

    public void setSummaryDate(Date summaryDate) {
        this.summaryDate = summaryDate;
    }

    public String getSummaryDescription() {
        return summaryDescription;
    }

    public void setSummaryDescription(String summaryDescription) {
        this.summaryDescription = summaryDescription;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "SettlementInfo{" +
                "loanId='" + loanId + '\'' +
                ", summaryPoint=" + summaryPoint +
                ", summaryDate=" + summaryDate +
                ", summaryDescription='" + summaryDescription + '\'' +
                ", borrowOrder=" + borrowOrder +
                '}';
    }
}
