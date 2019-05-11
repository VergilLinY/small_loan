package com.dt76.small_loan.pojo;

public class EWQualification {

    private String earlyWarningStage;
    private String isOpen;

    public EWQualification() {
    }

    public EWQualification(String earlyWarningStage, String isOpen) {
        this.earlyWarningStage = earlyWarningStage;
        this.isOpen = isOpen;
    }

    public String getEarlyWarningStage() {
        return earlyWarningStage;
    }

    public void setEarlyWarningStage(String earlyWarningStage) {
        this.earlyWarningStage = earlyWarningStage;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "EWQualification{" +
                "earlyWarningStage=" + earlyWarningStage +
                ", isOpen=" + isOpen +
                '}';
    }
}
