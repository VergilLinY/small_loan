package com.dt76.small_loan.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class SettlementInfo {

    private String loanId;              //借款ID
    private Integer summaryPoint;       //结项评分
    private Date summaryDate;           //结项时间
    private String summaryDescription;  //结项描述
    private CommonLoanInfo commonLoanInfo;  //公共信息
    private Boolean finished;           //是否结项

    public SettlementInfo() {
    }

    public SettlementInfo(String loanId, Integer summaryPoint, Date summaryDate, String summaryDescription, CommonLoanInfo commomLoanInfo, Boolean finished) {
        this.loanId = loanId;
        this.summaryPoint = summaryPoint;
        this.summaryDate = summaryDate;
        this.summaryDescription = summaryDescription;
        this.commonLoanInfo = commomLoanInfo;
        this.finished = finished;
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

    public CommonLoanInfo getCommonLoanInfo() {
        return commonLoanInfo;
    }

    public void setCommonLoanInfo(CommonLoanInfo commonLoanInfo) {
        this.commonLoanInfo = commonLoanInfo;
    }

    @Override
    public String toString() {
        return "SettlementInfo{" +
                "loanId='" + loanId + '\'' +
                ", summaryPoint=" + summaryPoint +
                ", summaryDate=" + summaryDate +
                ", summaryDescription='" + summaryDescription + '\'' +
                ", commonLoanInfo=" + commonLoanInfo +
                ", finished=" + finished +
                '}';
    }
}
