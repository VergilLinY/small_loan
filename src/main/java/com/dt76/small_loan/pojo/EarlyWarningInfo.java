package com.dt76.small_loan.pojo;

public class EarlyWarningInfo {
    private String alertId;
    private String alertName;
    private String loanType;
    private String loanProduct;
    private String fiveClassification;
    private int earlyWarningDays;
    private String warningTime;
    private String warningType;
    private boolean open;
    private String selectMember;

    public EarlyWarningInfo() {
    }

    public EarlyWarningInfo(String alertId, String alertName, String loanType, String loanProduct, String fiveClassification, int earlyWarningDays, String warningTime, String warningType, boolean open, String selectMember) {
        this.alertId = alertId;
        this.alertName = alertName;
        this.loanType = loanType;
        this.loanProduct = loanProduct;
        this.fiveClassification = fiveClassification;
        this.earlyWarningDays = earlyWarningDays;
        this.warningTime = warningTime;
        this.warningType = warningType;
        this.open = open;
        this.selectMember = selectMember;
    }

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanProduct() {
        return loanProduct;
    }

    public void setLoanProduct(String loanProduct) {
        this.loanProduct = loanProduct;
    }

    public String getFiveClassification() {
        return fiveClassification;
    }

    public void setFiveClassification(String fiveClassification) {
        this.fiveClassification = fiveClassification;
    }

    public int getEarlyWarningDays() {
        return earlyWarningDays;
    }

    public void setEarlyWarningDays(int earlyWarningDays) {
        this.earlyWarningDays = earlyWarningDays;
    }

    public String getWarningTime() {
        return warningTime;
    }

    public void setWarningTime(String warningTime) {
        this.warningTime = warningTime;
    }

    public String getWarningType() {
        return warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getSelectMember() {
        return selectMember;
    }

    public void setSelectMember(String selectMember) {
        this.selectMember = selectMember;
    }
}
