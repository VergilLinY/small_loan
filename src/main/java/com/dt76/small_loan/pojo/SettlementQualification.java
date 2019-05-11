package com.dt76.small_loan.pojo;

public class SettlementQualification {

    private Integer loanId;
    private String name;
    private String phone;
    private String contractNo;
    private Integer finish;

    public SettlementQualification() {
    }

    public SettlementQualification(Integer loanId, String name, String phone, String contractNo, Integer settlementFinish) {
        this.loanId = loanId;
        this.name = name;
        this.phone = phone;
        this.contractNo = contractNo;
        this.finish = settlementFinish;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "SettlementQualification{" +
                "loanId=" + loanId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", contractNo='" + contractNo + '\'' +
                ", finish=" + finish +
                '}';
    }
}
