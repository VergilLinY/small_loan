package com.dt76.small_loan.pojo;

public class SettlementCommitInfo {

    private Integer loanId;
    private Integer thePoint;
    private String theDescrip;

    public SettlementCommitInfo() {
    }

    public SettlementCommitInfo(Integer loanId, Integer thePoint, String theDescrip) {
        this.loanId = loanId;
        this.thePoint = thePoint;
        this.theDescrip = theDescrip;
    }

    public Integer getThePoint() {
        return thePoint;
    }

    public void setThePoint(Integer thePoint) {
        this.thePoint = thePoint;
    }

    public String getTheDescrip() {
        return theDescrip;
    }

    public void setTheDescrip(String theDescrip) {
        this.theDescrip = theDescrip;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    @Override
    public String toString() {
        return "SettlementCommitInfo{" +
                "loanId=" + loanId +
                ", thePoint=" + thePoint +
                ", theDescrip='" + theDescrip + '\'' +
                '}';
    }
}
