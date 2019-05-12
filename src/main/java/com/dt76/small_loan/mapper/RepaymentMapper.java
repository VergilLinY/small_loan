package com.dt76.small_loan.mapper;

import com.dt76.small_loan.pojo.CommonLoanInfo;
import com.dt76.small_loan.pojo.RepaymentQualification;

import java.util.List;

public interface RepaymentMapper {

    List<CommonLoanInfo> getPageList(RepaymentQualification q);
}
