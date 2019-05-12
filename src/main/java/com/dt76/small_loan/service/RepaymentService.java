package com.dt76.small_loan.service;

import com.dt76.small_loan.pojo.RepaymentInfo;
import com.dt76.small_loan.pojo.RepaymentQualification;
import com.dt76.small_loan.utils.PageResult;

import java.util.List;

public interface RepaymentService {

    PageResult qryAll(Integer cuPage, Integer size, RepaymentQualification q);
}
